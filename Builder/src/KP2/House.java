package KP2;

public class House implements BuildingBuilder{

	Building building;
	
	public House(){
		
		building = new Building();
	}

	
	public void buildStyle() {
		building.setType("chalet");
	}

	
	public void buildGarden() {
		building.setGarden(true);
	}

	
	public void buildTerrace() {
		building.setTerrace(false);
	}

	
	public void buildFloors() {
		building.setFloors(2);
	}

	
	public void buildRooms() {
		building.setRooms(5);
	}

	
	public void buildWindows() {
		building.setWindows(7);
	}

	
	public void buildDoors() {
		building.setDoors(3);
	}
	
	public Building getBuilding(){
		return building;
	}
	
	

}
