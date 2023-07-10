package hotel;

public abstract class Habitacion {
	
	//atributos
	byte idHabitacion;
	byte piso;
	byte numero;
	String estado;
	boolean ocupado;
	
	//constructor
	public Habitacion(byte idHabitacion, byte piso, byte numero, String estado, boolean ocupado) {
		super();
		this.idHabitacion = idHabitacion;
		this.piso = piso;
		this.numero = numero;
		this.estado = estado;
		this.ocupado = ocupado;
	}


}
