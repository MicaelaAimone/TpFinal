package hotel;

public class Habitacion {
	
	//atributos
	short numero; // como los nros son por ej = "304" el primer nro es el piso y los dos siguientes el nro de habitacion
	boolean ocupado;
	byte estado;
	
	//constructor
	public Habitacion( short numero, boolean ocupado, byte estado) {
		super();
		this.numero = numero;
		this.ocupado = false;
		this.estado = estado;
	}
	
	//Accedo a los datos con getter
	
	public byte getEstado() {
		return estado;
	}

	public short getNumero() {
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
