package hotel;

public abstract class Personas {
	
	//atributos
	String nombre;
	String apellido;
	String genero;
	String nacionalidad;
	String dni;
	String domicilio;
	
	//constructor
	public Personas(String nombre, String apellido, String genero, String nacionalidad, String dni, String domicilio) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.genero = genero;
		this.nacionalidad = nacionalidad;
		this.dni = dni;
		this.domicilio = domicilio;
	}
	
	
	
}
