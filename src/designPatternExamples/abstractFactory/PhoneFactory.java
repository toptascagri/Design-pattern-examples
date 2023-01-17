package designPatternExamples.abstractFactory;

public interface PhoneFactory {

	Phone getPhone(String model,String battery,int height,int latitude);
}
