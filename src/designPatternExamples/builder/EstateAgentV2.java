package designPatternExamples.builder;

public class EstateAgentV2 {

	public static void main(String[] args) {
		
		Home home1= HomeBuilder.startNormalBuild("Ankara","Keçiören","Kuşcağız",4,2000)
	
		.setHasCarPark(true)
		.build()
		;
		
		Home home2= HomeBuilder.startBuildWithPool("Ankara","Keçiören","Kuşcağız",4,2000)
				
				.setHasCarPark(false)
				.build()
				;
				
		
		printHome(home1);
		printHome(home2);
	}
	
	private static void printHome(Home home) {
		System.out.println("Home added :"+home);
	}
}
