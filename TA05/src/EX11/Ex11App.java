package EX11;

import java.util.Scanner;

public class Ex11App {

	public static void main(String[] args) {
		// Scanner
		Scanner sc = new Scanner(System.in);

		//Variable
		String dia;
		
		//Programa
		System.out.println("**Introduce un dia de la semana**");	
		dia = sc.nextLine(); 
		
		switch (dia.toLowerCase()) {
		case "lunes":
			System.out.println("Es un dia laboral");
			break;
		case "martes":
			System.out.println("Es un dia laboral");
			break;
		case "miercoles":
			System.out.println("Es un dia laboral");
			break;
		case "jueves":
			System.out.println("Es un dia laboral");
			break;
		case "viernes":
			System.out.println("Es un dia laboral");
			break;
		case "sabado":
			System.out.println("No es un dia laboral");
			break;
		case "domingo":
			System.out.println("No es un dia laboral");
			break;

		default:
			System.out.println("****ERROR****");
			System.out.println("DIA INCORRECTO");
			break;
		}
		
	}
}
