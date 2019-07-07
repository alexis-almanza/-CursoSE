package cursose;

public class _06_Numeros {
	public static void main(String[] args) {
		String texto = "99";
		int suma = Integer.parseInt(texto) + 1;
		
		String text = "281";
		int rest = Integer.parseInt(text) - 81;		
		
		String tex = "23.434";
		double minus = Double.parseDouble(tex) +32;
		
		System.out.println(suma);
		System.out.println(rest);
		System.out.println(minus);
		
		
		
		int valor= 3;
		Integer  num= 5;
		String sum= "53";
		String res= "12.73";
		
		System.out.println("Estos son elementos nuevos: " + valor +", "+num);
		
		int val1 = Integer.parseInt(sum);
		System.out.println("este es tipo de dato int: " + val1);
		double val2 = Double.parseDouble(res);
		System.out.println("este es tipo double: " + val2);
		
	}
}
