package cursose;

public class _22_alcanceVariables { 
	int edad = 24;
	
	public void MostrarEdad() {
		System.out.println(edad);
	}
	
	public void mostrar() {
		int edad1 = 12;
		System.out.println(edad1);
	}
	
	
	
	public static void main(String[] args) {
		_22_alcanceVariables sc =new _22_alcanceVariables();
		
		sc.MostrarEdad();
		sc.mostrar();
	}
}
