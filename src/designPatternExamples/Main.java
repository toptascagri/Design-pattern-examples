package designPatternExamples;

import designPatternExamples.abstractFactory.Note8Factory;
import designPatternExamples.abstractFactory.Phone;
import designPatternExamples.abstractFactory.S8Factory;

//import designPatternExamples.FactoryDesign.PhoneFactory;
//import designPatternExamples.abstractFactory.Phone;
//import designPatternExamples.singletonDp.Singleton;

public class Main {

	public static void main(String[] args) {
	
//		for (int i = 0; i < 10; i++) {
//		
//			Singleton singelton=Singleton.getSingleton();
//		
//		Phone s8 =PhoneFactory.getPhone("S8", "3200", 4, 5);
//		Phone note8 =PhoneFactory.getPhone("Note8","5200",3, 5);
//		System.out.println(s8);
//		System.out.println(note8);
		S8Factory s8Factory = new S8Factory();
		Phone s8=s8Factory.getPhone("s8", "5300",8, 10);
		System.out.println(s8);
		Note8Factory note8Factory=new Note8Factory();
		Phone note8=note8Factory.getPhone("note8", "3450",12, 15);
		System.out.println(note8);
	}
	
}


