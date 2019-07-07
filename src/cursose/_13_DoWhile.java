package cursose;

import java.util.Scanner;

public class _13_DoWhile {
	public static void main(String[] args) {
		int i = 0;
		
		do {
			System.out.println(i);
			i++;
		}while(i<5);
		
		String nombre;
		do {
			System.out.println("Ingresa tu opcion: ");
			Scanner input = new Scanner(System.in);
			nombre = input.next();
		}while(!nombre.equals("Alexis"));
		
		System.out.println("Has ingresado una opcion correcta");
		
		
		//utilizar while cuando la variable a sido inicializada, y do while cuando quiera evaluar 
		
	}
}
