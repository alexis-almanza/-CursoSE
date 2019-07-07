package cursose;

public class _21_metodos {
	private String nombre;//atributo
	private int edad;
	
	public void prueba(String nombre) {  //metodo
		System.out.println("Hola " + nombre);
	}
	
	public String prueba1(String nombre, int edad) {
		return nombre + edad;
	}
	
	public static void main(String[] args) {
		_21_metodos sc = new _21_metodos();
		sc.prueba("ALEXIS");
		
		
		String recibe = sc.prueba1("Alexis almanza ", 32);
		System.out.println(recibe);
	}

}
