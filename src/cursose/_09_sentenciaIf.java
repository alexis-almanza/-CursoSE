package cursose;

public class _09_sentenciaIf {
	public static void main(String[] args) {
		int x = 12;
		int y = 32;
		int mayor;
		//  despues del signo ? la "x" se entiende como la sentendia "if" y la "y" como "else" 
		mayor = (x < y) ? x : y;
		System.out.println(mayor);
	}
}
