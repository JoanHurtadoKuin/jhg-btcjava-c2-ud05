package EX10;

import java.util.Iterator;
import java.util.Scanner;

public class Ex10App {

	public static void main(String[] args) {
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		//Variables
		int pedidos;
		double sumaTotal = 0;
		
		//Programa
		System.out.println("**Introduce el numero de ventas**");
		pedidos = sc.nextInt();
		
		for (int i = 1; i <= pedidos; i++) {		
			System.out.println("Precio del producto " + i);
			double precio = sc.nextInt();	
			sumaTotal = sumaTotal + precio;
		}
		
		sc.close();
		System.out.println("La suma total de los pedidos es: " + sumaTotal + "€");
	}

}
