package patterns;

public class Hospital {
	
	public static void main(String[] args){
		
		RoomFactory roomFactory = new RoomFactory();
		
		Room cuarto1 = roomFactory.getRoom("quirofano");
		
		Room cuarto2 = roomFactory.getRoom("baño");
		
		Room cuarto3 = roomFactory.getRoom("baño");
		
		Room cuarto4 = roomFactory.getRoom("baño");
		
		Room cuarto5 = roomFactory.getRoom("cuarto comun");
		
		Room cuarto6 = roomFactory.getRoom("cuarto comun");
	}

}
