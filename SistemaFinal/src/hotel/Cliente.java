package hotel;

public class Cliente extends Personas {

	//atributos
	int idCliente;
	byte cantPersonas;
	String domicilioOrigen;
	

	//constructor
	public Cliente(String nombre, String apellido, String genero, String nacionalidad, String dni, String domicilio,
			int idCliente, byte cantPersonas, String domicilioOrigen) {
		super(nombre, apellido, genero, nacionalidad, dni, domicilio);
		this.idCliente = idCliente;
		this.cantPersonas = cantPersonas;
		this.domicilioOrigen = domicilioOrigen;
	}

	

	
}