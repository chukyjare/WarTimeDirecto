package modelo;

import vista.info.FichaInfo;

public class Tablero {
	private int ancho, alto;
	
	public int getAncho() {
		return ancho;
	}

	public int getAlto() {
		return alto;
	}
	// Como tambien puede ser un castillo, habr� que remodelar esto
	private Matriz<Coordenada, Casilla> casillas;

	public Tablero(int ancho, int alto) {
		super();
		this.ancho = ancho;
		this.alto = alto;
		casillas = new Matriz<Coordenada, Casilla>(ancho, alto);
	}

	public Casilla getCasilla(Coordenada coordenada) {
		return casillas.getElement(coordenada);
	}

	
	public boolean insertar(Casilla casilla,Coordenada coordenada) {
		boolean respuesta=false;
		if (!casillas.contieneElemento(casilla) && !casillas.contieneClave(coordenada)) {
			casillas.insertElement(coordenada, casilla);
			respuesta=true;
		}
		return respuesta;
	}
}
