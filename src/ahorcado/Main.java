package ahorcado;

public class Main {

	public static void main(String[] args) {
		Palabra palabra = new Palabra();
		int i = 0;
		palabra.cuentaPalabra();
		palabra.muestra();
		while (palabra.comprobar()==false) {
			palabra.introLetra();
			palabra.compara();
			palabra.muestra();
			i++;
		}

	}
}
