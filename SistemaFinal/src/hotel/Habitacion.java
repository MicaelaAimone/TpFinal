package hotel;

public abstract class Habitacion {
	
	//atributos
	byte idHabitacion;
	byte piso;
	byte numero;
	boolean ocupado;
	
	//constructor
	public Habitacion(byte idHabitacion, byte piso, byte numero, boolean ocupado) {
		super();
		this.idHabitacion = idHabitacion;
		this.piso = piso;
		this.numero = numero;
		this.ocupado = true;
	}
	
	//Accedo a los datos con getter

	public byte getIdHabitacion() {
		return idHabitacion;
	}


	public byte getPiso() {
		return piso;
	}

	public byte getNumero() {
		return numero;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	//setter para modificar si se ocupa alguna habitacion
	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	
	
	


}
