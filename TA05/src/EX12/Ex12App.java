package EX12;

import java.util.Scanner;

public class Ex12App {

	public static void main(String[] args) {
		// Scanner
		Scanner sc = new Scanner(System.in);

		// Variables
		String contrase�a;
		String confirmarContrase�a;
		int intentos = 3;
		boolean contrase�aCorrecta = false;

		// Programa
		System.out.println("**Introduce una contrase�a**");
		contrase�a = sc.nextLine();

		// Bucle para confirmar la contrase�a
		do {

			System.out.println("Introduce tu contrase�a, numero de intentos: " + intentos);
			confirmarContrase�a = sc.nextLine();

			if (confirmarContrase�a.equals(contrase�a)) { // Si es correcto
				System.out.println("Enhorabuena");
				contrase�aCorrecta = true; // True para salir del bucle
			} else { // Incorrecto
				intentos--;
				System.out.println("**ERROR** \nContrase�a incorrecta");
			}

		} while (intentos != 0 && !contrase�aCorrecta);
		sc.close();
	}

}
