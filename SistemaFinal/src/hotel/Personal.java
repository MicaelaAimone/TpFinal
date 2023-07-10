package hotel;

public class Personal extends Personas{
	
	//atributos
	byte idPersonal;
	float sueldo;
	int horasSemanales;
	String estado;
	
	//constructor
	public Personal(String nombre, String apellido, String genero, String nacionalidad, String dni, String domicilio,
			byte idPersonal, float sueldo, int horasSemanales, String estado) {
		super(nombre, apellido, genero, nacionalidad, dni, domicilio);
		this.idPersonal = idPersonal;
		this.sueldo = sueldo;
		this.horasSemanales = horasSemanales;
		this.estado = estado;
	}

	//Accedo a los datos con getter
	
	public byte getIdPersonal() {
		return idPersonal;
	}


	public float getSueldo() {
		return sueldo;
	}

	public int getHorasSemanales() {
		return horasSemanales;
	}

	public String getEstado() {
		return estado;
	}
	
	

	
	
}
