package ahorcado;

public class Palabra {

	private String[] palabras = { "repartidor", "caramelo", "artropodo", "placa", "ropero" };
	private static char[] adivina;
	private static char[] errores = new char[4];
	private String palabra;
	private static int x;
	private char letra;
	private boolean igual;
	int vidas = 5;

	private void selecPalabra() {
		palabra = palabras[(int) (Math.random() * 5)];

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
			if (a[i] == letra)
				adivina[i] = letra;
		}
		String adi = new String(adivina);
		if (palabra.equals(adi))
			igual = true;
	}

	public boolean comprobar() {
		return igual;
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
