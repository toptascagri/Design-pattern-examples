package designPatternExamples.FactoryDesign;

import designPatternExamples.abstractFactory.Note8;
import designPatternExamples.abstractFactory.Phone;
import designPatternExamples.abstractFactory.S8;

public class PhoneFactory {

	public static Phone getPhone(String model,String battery,int height,int latitude) {
		Phone phone ;
		if (model=="S8") {
			phone =new S8(model,battery,height,latitude);
		}
		else if (model =="Note8") {
			phone =new Note8(model,battery,height,latitude);
		}
		else {
		throw new RuntimeException("Geçerli bir model değildir.");
		}
		return phone;
	}
	
}
