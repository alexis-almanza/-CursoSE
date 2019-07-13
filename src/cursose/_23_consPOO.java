package cursose;

public class _23_consPOO {
	String nombre;
	String color;
	
	public _23_consPOO (String nombre, String color) {  //es el constructor
		this.nombre = nombre;
		this.color = color;
	}
	
	public void llamar() {
		System.out.println("Estas llamando a " + nombre );
	}
	
}
