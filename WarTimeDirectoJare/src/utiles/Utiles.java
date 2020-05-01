package utiles;

import modelo.Coordenada;

public class Utiles {

		public static String nombrar(int i, int j) {
			return String.valueOf(i)+":"+String.valueOf(j);
		}
		public static Coordenada getCoordenada(String coordenada) {
			String[] split=coordenada.split(":");
			return new Coordenada(Integer.parseInt((split[0])), Integer.parseInt((split[1])));
		}
}
