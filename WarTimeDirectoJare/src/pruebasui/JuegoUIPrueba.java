package pruebasui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Batallon;
import modelo.Coordenada;
import modelo.Ejercito;
import modelo.Tablero;
import modelo.Tipo;
import vista.BordeArmada;
import vista.TableroUI;
import vista.Conversores.Generador;
import vista.info.TableroUIInfo;

public class JuegoUIPrueba extends JFrame {

	private JPanel contentPane;
	private TableroUI tableroUI;
	private Ejercito ejercito;
	public TableroUI getTableroUI() {
		return tableroUI;
	}


	/**
	 * Create the frame.
	 */
	public JuegoUIPrueba() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		BordeArmada pobladorPanel = new BordeArmada();
		contentPane.add(pobladorPanel, BorderLayout.WEST);
		ejercito = new Ejercito(0);
		pobladorPanel.cargarEjercito(Generador.getEjercitoInfo(ejercito));
		
		
		
		Tablero tablero=new Tablero(6, 12);
		tablero.insertar(new Batallon(4, Tipo.infanteria), new Coordenada(4, 4));
		TableroUIInfo tableroUIInfo=new TableroUIInfo(tablero);
		
		tableroUI = new TableroUI(6, 12,tableroUIInfo);
		
		contentPane.add(tableroUI, BorderLayout.CENTER);
		setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
	}

}
