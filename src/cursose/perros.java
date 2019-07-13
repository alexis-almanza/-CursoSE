package cursose;

public class perros extends _26_herencia {
	private String apodo;
	
	public perros(String nombre,String raza, int edad,String apodo) {
		super(nombre, raza, edad);//se envian al constructor de la clase
		this.apodo = apodo;
	}//sub clase
	
	public void setApodo(String apodo) {
		this.apodo = apodo;
	}
	
	public String getApodo() {
		return apodo;
	}
	
	public void mostrar() {
		System.out.println(getNombre() + " - " + getEdad() + " - " + getRaza() + " - " + getApodo());

	}

}

//palabra reservada "extends", que sirve para hacer en una clase menor 
