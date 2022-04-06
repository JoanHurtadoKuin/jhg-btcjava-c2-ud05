package EX03;

import javax.swing.JOptionPane;

public class Ex03App {

	public static void main(String[] args) {

		//Variables
		String nombre;
		
		//Programa
		nombre = JOptionPane.showInputDialog("**Introduce tu nombre**");
		JOptionPane.showMessageDialog(null, "Bienvenido " + nombre);
	}

}
