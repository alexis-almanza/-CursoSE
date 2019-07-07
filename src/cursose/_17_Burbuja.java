package cursose;

import java.util.Scanner;

public class _17_Burbuja {
	public static void main(String[] args) {
		String[] nombre = new String[3];
		int[] edad = new int[3];
		
		for(int i=0;i<3;i++) {
			Scanner input = new Scanner(System.in);
			System.out.println("Input your name: ");
			nombre[i] = input.next();
			System.out.println("Input your age: ");
			edad[i] = input.nextInt();
		}
		
		int aux;
		
		//compareTo, esto sirve para los String y poder ordenar los nombres
		
		for(int i=0; i<2;i++) {
			for(int j=0; j<2-i;j++) {
				if(edad[j] > edad[j+1]) {
					aux=edad[j];
					edad[j] = edad[j+1];
					edad[j+1] = aux;
				}
			}
		}
		
		for(Integer valor: edad) {
			System.out.println("age: " + valor);
		}
		
	}
}
