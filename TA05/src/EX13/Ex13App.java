package EX13;

import java.util.Scanner;

public class Ex13App {

	public static void main(String[] args) {
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		//Variables
		int num1;
		int num2;
		char operador;
		
		//Programa
		
		System.out.println("Introduce el primer numero entero");
		num1 = sc.nextInt();
		System.out.println("Introduce el segundo numero entero");
		num2 = sc.nextInt();
		System.out.println("Introduce el operador (+,-,*,/,^,%)");
		operador = sc.next().charAt(0);
		
		sc.close();
		
		switch (operador) {
		case '+':
			System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
			break;
		case '-':
			System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
			break;
		case '*':
			System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
			break;
		case '/':
			System.out.println(num1 + " / " + num2 + " = " + ((double)num1/num2));
			break;
		case '^':
			System.out.println(num1 + "^" + num2 + " = " + (Math.pow(num1, num2)));
			break;
		case '%':
			System.out.println(num1 + " % " + num2 + " = " + (num1%num2));
			break;

		default:
			System.out.println("****ERROR**** \nOperador Incorrecto");
			break;
		}
		

	}

}
