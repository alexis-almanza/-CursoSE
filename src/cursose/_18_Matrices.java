package cursose;

import java.util.Scanner;

public class _18_Matrices {
	public static void main(String[] args) {
		System.out.println("Ingresa el tamaño de la matriz: ");
		Scanner input= new Scanner(System.in);
		int tam = input.nextInt();
		int[][] vector = new int[tam][tam];

		System.out.println("Ingresa datos para la matriz: ");
		for(int i=0;i<tam;i++) {
			for(int j=0;j<tam;j++) {
				vector[i][j] = input.nextInt();
			}
		}
		
		System.out.println("datos: ");
		
		for(int i=0;i<tam;i++) {
			for(int j=0;j<tam;j++) {
				if(i == j) {
					System.out.print( vector[i][j]);
				}else {
					System.out.print(0);
				}
			}
			System.out.print("\n");
		}
		

	}

}
