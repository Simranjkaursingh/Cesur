import java.util.Scanner;

public class Frases {
	static final int CANTIDAD = 10;
	static String[] cadenas = new String[CANTIDAD];

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		for (int index = 0; index < CANTIDAD; index++) {
			System.out.print("Escribe una frase: ");
			setValue(cadenas, index, teclado.nextLine());
		}

		for (int index = 0; index < CANTIDAD; index++) {
			System.out.println(getValue(cadenas, index));

		}

		teclado.close();
	}

	static String getValue(String[] cadenas, int posicion) {
		return cadenas[posicion];
	}

	String getValue(int posicion) {
		return cadenas[posicion];
	}

	static void setValue(String[] cadenas, int posicion, String nuevacadenas) {
		cadenas[posicion] = nuevacadenas;
	}

}
