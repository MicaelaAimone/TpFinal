package hotel;

public class Reserva extends Habitacion{

	//atributos
	int idReserva;
	int infoCliente; //idcliente
	int infoHabitacion; //idhabitacion
	//fechaInicio = checkIn; javautil
	//fechaFin = checkout; javautil
	
	//constructor
	public Reserva(byte idHabitacion, byte piso, byte numero, String estado, boolean ocupado, int idReserva,
			int infoCliente, int infoHabitacion) {
		super(idHabitacion, piso, numero, estado, ocupado);
		this.idReserva = idReserva;
		this.infoCliente = infoCliente;
		this.infoHabitacion = infoHabitacion;
	}
	
	


}
