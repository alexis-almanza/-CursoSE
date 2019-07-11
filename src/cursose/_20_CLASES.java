package cursose;

public class _20_CLASES {
	private String nombre;
	private int edad;
	private boolean precio;
	
	public void prueba() {
		nombre = "Alexis";
		edad = 19;
		precio = true;
		
		System.out.println("Hola " + nombre);
		System.out.println("Esta es mi edad " + edad);
		System.out.println("Pago a hacer " + precio);
	}
	
	public static void main(String[] args) {
		_20_CLASES sc = new _20_CLASES();
		sc.prueba();
		
		_23_consPOO input = new _23_consPOO("Alexis" , "rojo ");
		input.llamar();
	}

}
