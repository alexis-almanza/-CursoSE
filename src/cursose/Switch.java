package cursose;

public class Switch {
	public static void main(String[] args) {
		
		String valor = "Alexis";
		
		switch(valor) {
		case "NES": 
			System.out.println("valor 1 "); 
			break;
		case "GEERA":
			System.out.println("valor 2 "); 
			break;
		case "Alexis":
			System.out.println("valor 3 "); 
			break;
			default:
				System.out.println("no se encontro valor "); 
				break;
		}
	}

}
