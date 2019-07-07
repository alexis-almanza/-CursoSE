package cursose;

import java.util.Scanner;

public class _15_vecParalelos {
	public static void main(String[] args) {
		
		System.out.println("Ingresa el tamaño del vector: ");
		Scanner input = new Scanner(System.in);
		int tam = input.nextInt();
		
		String[] nombre = new String[tam];
		int[] edad = new int[tam];
		
		for(int i = 0 ;i < edad.length;i++) {
			System.out.println("Ingresa tu nombre: ");
			nombre[i] = input.next();
			System.out.println("Ingresa tu edad: ");
			edad[i] = input.nextInt();
		}
		
		System.out.println("-------------------------------------");
		
		for(int i = 0; i<edad.length ;i++) {
			System.out.println("datos :" + nombre[i] +" "+ edad[i]);
		}
		
		
	}
}
