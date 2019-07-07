package cursose;

import java.util.Scanner;

public class _11_CicloWhile {
	public static void main(String[] args) {
		
		String nombre = "";
		
		while(!nombre.equals("Alexis")) {
			System.out.println("tu no eres Alexis");
			Scanner input = new Scanner(System.in);
			nombre = input.next();
		}
		System.out.println("tu eres Alexis");
	}
}
