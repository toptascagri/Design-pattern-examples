package designPatternExamples.builder;


public class Home {

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
	

	

	public Home(String province, String district, String neighborhood, int yearOfBuilding, int numberOfRoom) {
		super();
		this.province = province;
		this.district = district;
		this.neighborhood = neighborhood;
		this.yearOfBuilding = yearOfBuilding;
		this.numberOfRoom = numberOfRoom;
	}
	


	public Home(String province, String district, String neighborhood, int yearOfBuilding, int numberOfRoom,
			int numberOfBalcony) {
		super();
		this.province = province;
		this.district = district;
		this.neighborhood = neighborhood;
		this.yearOfBuilding = yearOfBuilding;
		this.numberOfRoom = numberOfRoom;
		this.numberOfBalcony = numberOfBalcony;
	}
	



	public Home(String province, String district, String neighborhood, int yearOfBuilding, int numberOfRoom,
			boolean hasPool) {
		super();
		this.province = province;
		this.district = district;
		this.neighborhood = neighborhood;
		this.yearOfBuilding = yearOfBuilding;
		this.numberOfRoom = numberOfRoom;
		this.hasPool = hasPool;
	}



	public Home(String province, String district, String neighborhood, int yearOfBuilding, int numberOfRoom,
			int numberOfBath, int numberOfBalcony, boolean isDublex, boolean isFurnished, boolean hasCarPark,
			boolean hasChildPark, boolean hasAirCond, boolean hasPool) {
		super();
		this.province = province;
		this.district = district;
		this.neighborhood = neighborhood;
		this.yearOfBuilding = yearOfBuilding;
		this.numberOfRoom = numberOfRoom;
		this.numberOfBath = numberOfBath;
		this.numberOfBalcony = numberOfBalcony;
		this.isDublex = isDublex;
		this.isFurnished = isFurnished;
		this.hasCarPark = hasCarPark;
		this.hasChildPark = hasChildPark;
		this.hasAirCond = hasAirCond;
		this.hasPool = hasPool;
	}



	public Home() {
	
	}


	@Override
	public String toString() {
		return "Home [province=" + province + ", district=" + district + ", neighborhood=" + neighborhood
				+ ", yearOfBuilding=" + yearOfBuilding + ", numberOfRoom=" + numberOfRoom + ", numberOfBath="
				+ numberOfBath + ", numberOfBalcony=" + numberOfBalcony + ", isDublex=" + isDublex + ", isFurnished="
				+ isFurnished + ", hasCarPark=" + hasCarPark + ", hasChildPark=" + hasChildPark + ", hasAirCond="
				+ hasAirCond + ", hasPool=" + hasPool + "]";
	}


	public String getProvince() {
		return province;
	}


	public void setProvince(String province) {
		this.province = province;
	}


	public String getDistrict() {
		return district;
	}


	public void setDistrict(String district) {
		this.district = district;
	}


	public String getNeighborhood() {
		return neighborhood;
	}


	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}


	public int getYearOfBuilding() {
		return yearOfBuilding;
	}


	public void setYearOfBuilding(int yearOfBuilding) {
		this.yearOfBuilding = yearOfBuilding;
	}


	public int getNumberOfRoom() {
		return numberOfRoom;
	}


	public void setNumberOfRoom(int numberOfRoom) {
		this.numberOfRoom = numberOfRoom;
	}


	public int getNumberOfBath() {
		return numberOfBath;
	}


	public void setNumberOfBath(int numberOfBath) {
		this.numberOfBath = numberOfBath;
	}


	public int getNumberOfBalcony() {
		return numberOfBalcony;
	}


	public void setNumberOfBalcony(int numberOfBalcony) {
		this.numberOfBalcony = numberOfBalcony;
	}


	public boolean isDublex() {
		return isDublex;
	}


	public void setDublex(boolean isDublex) {
		this.isDublex = isDublex;
	}


	public boolean isFurnished() {
		return isFurnished;
	}


	public void setFurnished(boolean isFurnished) {
		this.isFurnished = isFurnished;
	}


	public boolean isHasCarPark() {
		return hasCarPark;
	}


	public void setHasCarPark(boolean hasCarPark) {
		this.hasCarPark = hasCarPark;
	}


	public boolean isHasChildPark() {
		return hasChildPark;
	}


	public void setHasChildPark(boolean hasChildPark) {
		this.hasChildPark = hasChildPark;
	}


	public boolean isHasAirCond() {
		return hasAirCond;
	}


	public void setHasAirCond(boolean hasAirCond) {
		this.hasAirCond = hasAirCond;
	}


	public boolean isHasPool() {
		return hasPool;
	}


	public void setHasPool(boolean hasPool) {
		this.hasPool = hasPool;
	}
	
	
}
