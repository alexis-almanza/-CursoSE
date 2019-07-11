package cursose;

public class _24_Constructor {

	String nombre;
	String apellido;
	
	public _24_Constructor() {
		System.out.println("Hola Alexis este es un Constructor");
	}	
	
	public _24_Constructor(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public _24_Constructor(String nombre) {
		this.nombre = nombre;
	}
	
	public void llamar() {
		System.out.println("Le estas llamando a " + nombre);
		
	}
	
	
}
