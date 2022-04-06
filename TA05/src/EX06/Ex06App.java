package EX06;

import java.util.Scanner;

public class Ex06App {

	public static void main(String[] args) {
		//Scanner
		Scanner sc = new Scanner(System.in);
		//Constante
		final double IVA = 0.21;
		//Variables
		double num;
		double resultado;

		//Programa
		System.out.println("**Introduce el precio del producto**");
		num = sc.nextDouble();
		
		resultado = num + (num*IVA);
		
		System.out.println("El precio final es: " + resultado + "€");
		
	}

}
