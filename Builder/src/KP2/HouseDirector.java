package KP2;

public class HouseDirector {
	
	private BuildingBuilder bBuilder = null;
	
	public HouseDirector(BuildingBuilder bBuilder){
		
		this.bBuilder = bBuilder;
	}
	
	public void constructHouse(){
		
		bBuilder.buildDoors();
		bBuilder.buildFloors();
		bBuilder.buildGarden();
		bBuilder.buildStyle();
		bBuilder.buildRooms();
	}
	
	public Building getBuilding(){
		
		return bBuilder.getBuilding();
	}
}
