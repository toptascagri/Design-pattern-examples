package designPatternExamples;

import designPatternExamples.singletonDp.Singleton;

public class Main {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
		
			Singleton singelton=Singleton.getSingleton();
		}
		

	}

}
