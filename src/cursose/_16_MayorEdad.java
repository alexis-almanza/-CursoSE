package cursose;

import java.util.Scanner;

public class _16_MayorEdad {
	public static void main(String[] args) {
		System.out.println("Input the size: ");
		Scanner sc = new Scanner(System.in);
		int tam = sc.nextInt();
		
		String[] nombre = new String[tam];
		int[] edad = new int [tam];
		for(int i = 0; i<edad.length; i++) {
			System.out.println("Input your name: ");
			nombre[i] = sc.next();
			System.out.println("Input your age: ");
			edad[i] = sc.nextInt();
		}
		
		System.out.println("-------------------------------------");
		
		int mayor = edad[0];
		int menor = edad[0];
		int posicion = 0;
		
		for(int i=0; i<edad.length; i++) {
			if(edad[i]>mayor) {
				mayor = edad[i];
				posicion = i;
			}
		}
		
		System.out.println("Age of the user: " + mayor);
		System.out.println("This is the name of the user: " + nombre[posicion]);
	}
}
