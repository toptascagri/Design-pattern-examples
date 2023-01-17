package designPatternExamples.abstractFactory;

public class Note8Factory implements PhoneFactory {

	@Override
	public Phone getPhone(String model, String battery, int height, int latitude) {
		// TODO Auto-generated method stub
		return new Note8(model, battery, height, latitude);
	}

}
