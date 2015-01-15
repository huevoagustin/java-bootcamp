package KP2;

public class Test {

	public static void main(String[] args) {
		
		BuildingBuilder bBuilder = new House();
		HouseDirector hDirector = new HouseDirector(bBuilder);
		hDirector.constructHouse();
		Building building = hDirector.getBuilding();
		System.out.println("the building is:" + building);
	}

}
