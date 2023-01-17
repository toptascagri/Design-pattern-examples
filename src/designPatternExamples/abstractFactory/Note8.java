package designPatternExamples.abstractFactory;

public class Note8 implements Phone{
	
	private String model;
	private String battery;
	private int height;
	private int latitude;
	
	public Note8(String model, String battery, int height, int latitude) {
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
		return "Note8 [model=" + model + ", battery=" + battery + ", height=" + height + ", latitude=" + latitude + "]";
	}
	

}
