package patterns;

public class RoomFactory {
	
	public Room getRoom(String tipo){
		
		if (tipo.equals("cuarto comun"))
			return new HabitacionComun();
		if (tipo.equals("quirofano"))
			return new Quirofano();
		if (tipo.equals("ba�o"))
			return new Ba�o();

		return null;
	}

}
