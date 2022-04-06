package EX05;

import java.util.Scanner;

public class Ex05App {

	public static void main(String[] args) {
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		//Variable
		double num;
		
		//Programa
		System.out.println("**Introduce un numero**");
		num = sc.nextDouble();
		
		sc.close();//Cerramos el scanner
		
		if(num % 2 == 0){
			System.out.println("El numero " + num + " es divisible entre 2");
		}else {
			System.out.println("El numero " + num + " no es divisible entre 2");
		}
		
		
	}

}
