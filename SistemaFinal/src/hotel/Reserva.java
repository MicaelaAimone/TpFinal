package hotel;

public class Reserva extends Habitacion{

	//atributos
	int idReserva;
	int infoCliente; //idcliente
	int infoHabitacion; //idhabitacion
	//fechaInicio = checkIn; java time
	//fechaFin = checkout; java time
	
	//constructor
	public Reserva(byte idHabitacion, byte piso, byte numero, boolean ocupado, int idReserva,
			int infoCliente, int infoHabitacion) {
		super(idHabitacion, piso, numero, ocupado);
		this.idReserva = idReserva;
		this.infoCliente = infoCliente;
		this.infoHabitacion = infoHabitacion;

	}	//Accedo a los datos con getter
	

	public int getIdReserva() {
		return idReserva;
	}

	public int getInfoCliente() {
		return infoCliente;
	}

	public int getInfoHabitacion() {
		return infoHabitacion;
	}
	
	
	
	
	


}
