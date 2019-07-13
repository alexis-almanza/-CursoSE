package cursose;

public class pruebas {
	public static void main(String[] args) {
		
		_25_getSet sc = new _25_getSet();
		sc.setNombre("Alexis");
		sc.setApellido("Almanza Ortega");
		sc.setColor("GREEN");
		
		String apellido = sc.getApellido();
		String nombre = sc.getNombre();
		System.out.println(nombre);
		System.out.println(apellido);
		System.out.println(sc.getColor());
		
		
		//el set y get se utiliza para poder retornar los valores de ambito private
		
		
	}

}
