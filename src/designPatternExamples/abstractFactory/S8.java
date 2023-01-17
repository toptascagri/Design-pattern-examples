package designPatternExamples.abstractFactory;

public class S8 implements Phone{
	
	private String model;
	private String battery;
	private int height;
	private int latitude;
	
	public S8(String model, String battery, int height, int latitude) {
		super();
		this.model = model;
		this.battery = battery;
		this.height = height;
		this.latitude = latitude;
	}
	public String getModel() {
		return model;
	}
	public String getBattery() {
		return battery;
	}
	public int getHeight() {
		return height;
	}
	public int getLatitude() {
		return latitude;
	}
	@Override
	public String toString() {
		return "S8 [model=" + model + ", battery=" + battery + ", height=" + height + ", latitude=" + latitude + "]";
	}
	

}
