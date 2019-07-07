package cursose;

public class _08_strings {
	public static void main(String[] args) {
		String palabra1 = "Mitocode";
		String palabra2 = " mitocode";
		String concatenado = palabra1.concat(palabra2);
		
		int resultado = palabra1.compareToIgnoreCase(palabra2);
		
		System.out.println(concatenado);
		System.out.println(resultado);
	}

}
