package pruebasui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

import control.Controller;
import control.Juego;
import modelo.Coordenada;
import modelo.Ejercito;
import utiles.Utiles;
import vista.MercadoSoldadoDialog;
import vista.Conversores.Generador;

public class ParaJuegoUIPrueba extends JuegoUIPrueba {
	
	
	private Controller localizadorControler;
	private Ejercito ejercito;
	
	
	MouseAdapter mouseAdapter = new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			super.mouseClicked(e);
			JPanel panel = (JPanel) e.getSource();
//			panel.setBackground(Color.YELLOW);
			// Por esta razon el mouseAdapter tiene que ser una propiedad del tableroui
			Coordenada coordenada = Utiles.getCoordenada(panel.getName());
			if (!localizadorControler.localizar(coordenada)) {
				System.out.println("No se ha podido insertar");
			}
			getTableroUI().actualizarTablero(Generador.getTableroUIInfo(localizadorControler.getJuego()));
			
//				tableroUI.actualizarTablero(mouseAdapter);
//				tableroUI.actualizarTablero();
		}
	};
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ParaJuegoUIPrueba frame = new ParaJuegoUIPrueba();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ParaJuegoUIPrueba() {
		super();
		getTableroUI().setMouseAdapter(mouseAdapter);
		Juego juego= new Juego(6, 12);
		localizadorControler= new Controller(juego);
		getTableroUI().actualizarTablero(Generador.getTableroUIInfo(juego));
		
	}

}
