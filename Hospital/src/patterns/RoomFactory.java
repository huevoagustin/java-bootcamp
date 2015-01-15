package patterns;

public class RoomFactory {
	
	public Room getRoom(String tipo){
		
		if (tipo.equals("cuarto comun"))
			return new HabitacionComun();
		if (tipo.equals("quirofano"))
			return new Quirofano();
		if (tipo.equals("baño"))
			return new Baño();

		return null;
	}

}
