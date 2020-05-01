package modelo;

import java.util.LinkedList;

public class Ejercito {
	private int id;
	private static int infanteria = 1;
	private static int caballeria = 1;
	private static int arqueria = 1;
	private int idBatallonActual = 0;
	// Aunque tiene caracteristicas de SET (los batallones no se repiten)
	// me conviene una list porque puedo hacer get(i)
	LinkedList<Batallon> batallones = new LinkedList<Batallon>();
	
	
	public Ejercito(int id) {
		super();
		this.id = id;
		crearEjercito();
	}
	public boolean setSiguienteBatallon() {
		boolean respuesta=false;
		if (++idBatallonActual < batallones.size()) {
			respuesta=true;
		}else {
			idBatallonActual=0;
		}
		return respuesta;
	}

	private void crearEjercito() {
		int j=0;
		for (int i = 0; i < infanteria; i++) {
			batallones.add(new Batallon(j++,Tipo.infanteria));
		}
		for (int i = 0; i < caballeria; i++) {
			batallones.add(new Batallon(j++,Tipo.caballeria));

		}
		for (int i = 0; i < arqueria; i++) {
			batallones.add(new Batallon(j++,Tipo.arqueria));

		}
	}


	public int getId() {
		return id;
	}

	public static int getInfanteria() {
		return infanteria;
	}

	public static int getCaballeria() {
		return caballeria;
	}

	public static int getArqueria() {
		return arqueria;
	}

	public int getIdBatallonActual() {
		return idBatallonActual;
	}

	public Tipo getTipoBatallon() {
		return getBatallonActual().getTipo();
	}


	public Batallon getBatallonActual() {
		return batallones.get(idBatallonActual);
	}
}
