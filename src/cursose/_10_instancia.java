package cursose;

import java.util.Scanner;

public class _10_instancia {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Ingresa tu nombre: ");
		
		String nombre = input.next();
		
		System.out.println("Tu nombre es " + nombre);
		
		int lon = nombre.length();
		
		System.out.println(lon);
		
		System.out.println("ingresa un numero: ");
		 
		int numero = input.nextInt();
		
		System.out.println("Este es el numero ingresado " + numero);
	}
}
