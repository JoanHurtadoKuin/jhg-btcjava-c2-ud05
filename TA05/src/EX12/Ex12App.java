package EX12;

import java.util.Scanner;

public class Ex12App {

	public static void main(String[] args) {
		// Scanner
		Scanner sc = new Scanner(System.in);

		// Variables
		String contraseña;
		String confirmarContraseña;
		int intentos = 3;
		boolean contraseñaCorrecta = false;

		// Programa
		System.out.println("**Introduce una contraseña**");
		contraseña = sc.nextLine();

		// Bucle para confirmar la contraseña
		do {

			System.out.println("Introduce tu contraseña, numero de intentos: " + intentos);
			confirmarContraseña = sc.nextLine();

			if (confirmarContraseña.equals(contraseña)) { // Si es correcto
				System.out.println("Enhorabuena");
				contraseñaCorrecta = true; // True para salir del bucle
			} else { // Incorrecto
				intentos--;
				System.out.println("**ERROR** \nContraseña incorrecta");
			}

		} while (intentos != 0 && !contraseñaCorrecta);
		sc.close();
	}

}
