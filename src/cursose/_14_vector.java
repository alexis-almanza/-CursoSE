package cursose;

import java.util.Scanner;

public class _14_vector {
	public static void main(String[] args) {
		
		System.out.println("Ingresa el tamaño del vector: ");
		Scanner sc = new Scanner(System.in);
		int tam = sc.nextInt();
	
		
		
		
		String[] vector = new String[tam];
		
		for(int i = 0; i<vector.length;i++) {
			System.out.println("Ingresa los elementos: ");
			vector[i] = sc.next();
		}
		
		for(String s: vector) {
			System.out.println("Estos son los datos ingresados: " + s);
		}
		
	}
}
