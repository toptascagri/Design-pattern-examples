package designPatternExamples.builder;

public class EstateAgent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Home home1 =new Home();
		home1.setProvince("Istanbul");
		home1.setDistrict("Atasehir");
		home1.setNeighborhood("Ataturk");
		home1.setNumberOfRoom(3);
		home1.setYearOfBuilding(2010);
		home1.setHasAirCond(true);
		
//		
//		(String province, String district, String neighborhood, int yearOfBuilding, int numberOfRoom,
//				int numberOfBath, int numberOfBalcony, boolean isDublex, boolean isFurnished, boolean hasCarPark,
//				boolean hasChildPark, boolean hasAirCond, boolean hasPool)
		
		Home home2=new Home("Istanbul","Umraniye","Tatlisu",2008,2,3,0, false,false,true,true,false,true);
		
		printHome(home1);
		
	}
	
	private static void printHome(Home home) {
		System.out.println("Home added :"+home);
	}

}
