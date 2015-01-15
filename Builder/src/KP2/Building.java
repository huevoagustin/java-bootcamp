package KP2;

public class Building {
	
	private String type;
	private boolean garden;
	private boolean terrace;
	private int floors;
	private int doors;
	private int rooms;
	private int windows;
	
	public Building(){
		
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isGarden() {
		return garden;
	}

	public void setGarden(boolean garden) {
		this.garden = garden;
	}

	public boolean isTerrace() {
		return terrace;
	}

	public void setTerrace(boolean terrace) {
		this.terrace = terrace;
	}

	public int getFloors() {
		return floors;
	}

	public void setFloors(int floors) {
		this.floors = floors;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getRooms() {
		return rooms;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

	public int getWindows() {
		return windows;
	}

	public void setWindows(int windows) {
		this.windows = windows;
	}
	
	public String toString(){
		return "type:" + type + ", garden:" + garden + ", terrace:" + terrace + ", floors:" + floors + ", doors:" + doors + ", rooms:" + rooms + ", windows:" + windows;
		
	}
	
	


}
