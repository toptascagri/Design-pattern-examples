package designPatternExamples.builder;

public class HomeBuilder {
	private String province;
	private String district;
	private String neighborhood;
	
	private int yearOfBuilding;
	private int numberOfRoom;
	private int numberOfBath;
	private int numberOfBalcony;
	
	private boolean isDublex;
	private boolean isFurnished;
	private boolean hasCarPark;
	private boolean hasChildPark;
	private boolean hasAirCond;
	private boolean hasPool;
	

	public HomeBuilder setNumberOfBath(int numberOfBath) {
		this.numberOfBath = numberOfBath;
		return this;
	}


	public HomeBuilder setNumberOfBalcony(int numberOfBalcony) {
		this.numberOfBalcony = numberOfBalcony;
		return this;
	}


	public HomeBuilder setDublex(boolean isDublex) {
		this.isDublex = isDublex;
		return this;
	}


	public HomeBuilder setFurnished(boolean isFurnished) {
		this.isFurnished = isFurnished;
		return this;
	}


	public HomeBuilder setHasCarPark(boolean hasCarPark) {
		this.hasCarPark = hasCarPark;
		return this;
	}


	public HomeBuilder setHasChildPark(boolean hasChildPark) {
		this.hasChildPark = hasChildPark;
		return this;
	}


	public HomeBuilder setHasAirCond(boolean hasAirCond) {
		this.hasAirCond = hasAirCond;
		return this;
	}


	public HomeBuilder setHasPool(boolean hasPool) {
		this.hasPool = hasPool;
		return this;
	}


	public static HomeBuilder startNormalBuild(String province,String district,String neigborhood,int numberOfYear,int numberOfRoom) {
		HomeBuilder homeBuilder=new HomeBuilder();
		homeBuilder.province=province;
		homeBuilder.district=district;
		homeBuilder.neighborhood=neigborhood;
		homeBuilder.yearOfBuilding=numberOfYear;
		homeBuilder.numberOfRoom=numberOfRoom;
		
		return homeBuilder;
	}
	

	public static HomeBuilder startBuildWithPool(String province,String district,String neigborhood,int numberOfYear,int numberOfRoom) {
		HomeBuilder homeBuilder=new HomeBuilder();
		homeBuilder.province=province;
		homeBuilder.district=district;
		homeBuilder.neighborhood=neigborhood;
		homeBuilder.yearOfBuilding=numberOfYear;
		homeBuilder.numberOfRoom=numberOfRoom;
		homeBuilder.hasPool=true;
		
		return homeBuilder;
	}
	
	
	public Home build() {
		Home home =new Home();
		home.setProvince(province);
		home.setDistrict(district);
		home.setNeighborhood(neighborhood);
		
		home.setYearOfBuilding(yearOfBuilding);
		home.setNumberOfRoom(numberOfRoom);
		home.setNumberOfBath(numberOfBath);
		home.setNumberOfBalcony(numberOfBalcony);
		
		home.setDublex(isDublex);
		home.setFurnished(isFurnished);
		home.setHasCarPark(hasCarPark);
		home.setHasChildPark(hasChildPark);
		home.setHasAirCond(hasAirCond);
		home.setHasPool(hasPool);
		
		return home;
		
	}
}
