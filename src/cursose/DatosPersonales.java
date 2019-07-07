package cursose;

import java.util.Scanner;

public class DatosPersonales {
	public static void main(String[] args) {
		/*
		String nombre = "Alexis";
		System.out.println("Mi nombre es " + nombre);
		
		int edad = 4;
		String apellido = "Almanza Ortega";
		double precio = 2.32;
		Double price = null;
		long val1 = 212;
		float val2 = (float) 32.3;
		boolean val3 = false;
		
		System.out.println("val3 : " + val3);
		
		
		int x = 3;
		int y = 6;
		
		int suma = x + y;
		
		System.out.println("resultado: " + suma);
		System.out.println(x + y);
		
		String z = "5";
		int v = Integer.parseInt(z);
		
		System.out.println(v);
		
		String w = "20";
		String e = "99";
		
		int p = Integer.parseInt(w);
		int r = Integer.parseInt(e);
		
		System.out.println("Resultado1 : "+ p + r);//119
		System.out.println(p + r);//119
		
		char c = 's';
		Character t = 'A';
		System.out.println("Hola: " + c +" " + t);
		
		String l = "hola";
		char g = l.charAt(3);
		System.out.println(g);//pos 2 O
		
		String k = "HOLA";
		int k1 = l.compareTo(k);
		System.out.println(k1);
		
		int k2 = k.compareTo(l);
		System.out.println(k2);
		
		boolean f1=l.contains("x");
		System.out.println(f1);
		int w1= l.indexOf("X");
		System.out.println(w1);//0
		
		String r1=l.substring(1);
		System.out.println(r1 + " del mar");
		
		int tam =l.length();
		System.out.println(tam);
		String text1  = "hola buenas noches";
		String text2 = text1.substring(5,11);
		System.out.println(text2);
		
		int edad1 = 20;
		if(edad1 < 50) {
			System.out.println("es correcto");
		}else {
			System.out.println("Es incorrecto");
		}
		
		int val4 = 10;
		if(val4 == 50) {
			System.out.println("Es igual a 50");
		}else if(val4 == 40){
			System.out.println("Es igual a 40");
		}else if(val4 ==30) {
			System.out.println("Es igual a 30");
		}else if(val4 == 20){
			System.out.println("Es igual a 20");
		}else {
			System.out.println("Es incorrecto");
		}
		
		int sd = 10;
		int ds = 20;
		int mayor;
		if(sd > ds){
			mayor = sd;
		}else {
			mayor = ds;
		}
		System.out.println("Es mayor:" + mayor);
		
		mayor = (sd > ds)? sd: ds;
		System.out.println("Es correcto" + mayor);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digita tu edad: ");
		int edad4 = sc.nextInt();
		System.out.println("Digita tu nombre: ");
		String name = sc.next();
		
		System.out.println("tu nombre es " + name +" y tienes " + edad4 +" años");
		*/
		
		/*se cicla
		boolean var4 = true;
		while(var4) {
			System.out.println("Esta ciclando");
		}*/
		
		/*int val = 0;
		while(val < 10) {
			System.out.println(val +" Valor aun menor");
			val++;
		}*/
		
		String nombre = "";
		while(!nombre.equals("Alexis")) {
			System.out.println("no eres alexis");
			Scanner sc = new Scanner(System.in);
		    nombre = sc.next();
			
		}
		
		System.out.println("hola Alexis");
		
	}

}
