package cursose;

import java.util.Scanner;

public class _19_switch {
	public static void main(String[] args) {
		System.out.println("enter a word: ");
		Scanner input = new Scanner(System.in);
		String palabra = input.next();
		
		switch(palabra) {
		case "Alexis" : System.out.println("Hola Alexis"); break;
		case "Nestor" : System.out.println("Hola Nes"); break;
		case "To�o" : System.out.println("Hola To�o"); break;
		//default : System.out.println("adios"); break;
		}
		
		System.out.println("Hola por defecto");
	}
}
