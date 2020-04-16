package vista.info;

import modelo.Batallon;
import modelo.Tipo;

public class MercadoSoldadosInfo {
	private int batallonID;
	private int maxSoldados;
	private Tipo tipoBatallon;
	
	public MercadoSoldadosInfo(Batallon batallon) {
		super();
		this.batallonID = batallon.getId();
		this.maxSoldados = batallon.getMaximoSoldados();
		this.tipoBatallon = batallon.getTipo();
	}
	public MercadoSoldadosInfo(int batallonID, int maxSoldados, Tipo tipoBatallon) {
		super();
		this.batallonID = batallonID;
		this.maxSoldados = maxSoldados;
		this.tipoBatallon = tipoBatallon;
	}
	public int getBatallonID() {
		return batallonID;
	}
	public int getMaxSoldados() {
		return maxSoldados;
	}
	public Tipo getTipoBatallon() {
		return tipoBatallon;
	}
	
	
}
