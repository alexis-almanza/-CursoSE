package cursose;

public class _26_herencia {
	private String nombre;
	private String raza;
	private int edad;
	
	public _26_herencia(String nombre,String raza, int edad) {
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
	}// contructor , super clase
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getRaza() {
		return raza;
	}
	
	public int getEdad() {
		return edad;
	}
	
}
