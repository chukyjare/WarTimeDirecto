package vista.info;

import modelo.Especialidad;

public class EspecialidadesInfo {
	private Especialidad especialidad;
	private int cantidad;

	public EspecialidadesInfo(Especialidad especialidad, int cantidad) {
		super();
		this.especialidad = especialidad;
		this.cantidad = cantidad;
	}

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public int getCantidad() {
		return cantidad;
	}

}
