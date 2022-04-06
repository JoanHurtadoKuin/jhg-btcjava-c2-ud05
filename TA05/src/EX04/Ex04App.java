package EX04;

import java.util.Scanner;

public class Ex04App {

	public static void main(String[] args) {
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		//Variable
		double radio;
		double resultado;
		
		//Programa
		System.out.println("**Introduce el radio**");
		radio = sc.nextDouble();
		
		sc.close();//Cerramos el scanner
		
		//Calculamos el radio
		resultado = Math.PI* Math.pow(radio, 2);
		
		System.out.println("El area del circulo es: " + resultado);
		
	}

}
