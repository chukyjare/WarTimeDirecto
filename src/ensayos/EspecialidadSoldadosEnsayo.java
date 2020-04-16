package ensayos;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.JTextField;

import modelo.Especialidad;
import java.beans.PropertyChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;

public class EspecialidadSoldadosEnsayo extends JPanel {
	private JLabel lblEspecialidad;
	private JTextField txtCantidad;

	public JLabel getLblEspecialidad() {
		return lblEspecialidad;
	}

	public JTextField getTxtCantidad() {
		return txtCantidad;
	}

	/**
	 * Create the panel.
	 */
	public EspecialidadSoldadosEnsayo(Especialidad especialidad,FocusAdapter focusAdapter) {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		JLabel lblNewLabel = new JLabel("Especialidad     :");
		add(lblNewLabel);
		
		lblEspecialidad = new JLabel(String.valueOf(especialidad));
		add(lblEspecialidad);
		
		JLabel lblCantidadc = new JLabel("               Cantidad         :");
		add(lblCantidadc);
		
		txtCantidad = new JTextField("0");
		txtCantidad.addFocusListener(focusAdapter);
		txtCantidad.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				txtCantidad.setText("");
			}
		});
		add(txtCantidad);
		txtCantidad.setColumns(10);

	}

}
