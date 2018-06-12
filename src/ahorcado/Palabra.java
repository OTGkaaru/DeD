package ahorcado;

public class Palabra {

	private String[] palabras = { "repartidor", "caramelo", "artropodo","placa","ropero"};
	private static char[] adivina;
	private String palabra;
	private static int x;
	private char letra;

	private void selecPalabra() {

		palabra = palabras[(int) (Math.random() * 6) ];
	}

	public void cuentaPalabra() {
		selecPalabra();
		x = palabra.length();
		adivina = new char[x];
		rellenaAdivina();

	}

	public void compara() {
		char[] a = palabra.toCharArray();
		int i;

		for (i = 0; i < palabra.length(); i++) {
			if (a[i] == letra) {
				adivina[i] = letra;
			}
		}
	}

	public boolean comprobar() {
		if (palabra.equals(adivina))
			return true;
		return false;
	}

	private static void rellenaAdivina() {
		int i;
		for (i = 0; i < x; i++)
			adivina[i] = '_';
	}

	public void muestra() {
		System.out.println(adivina);
	}

	public void introLetra() {
		System.out.print("Letra? ");
		letra = Leer.datoChar();
	}

}
