package designPatternExamples.singletonDp;

public class Singleton {

	private static Singleton singleton;
	private static int counter=0;
	
	private Singleton() {
		System.out.println("Singleton olustu");
	}

	public static Singleton getSingleton() {
		
		if (singleton==null) {
			//Double Checked Locking
			synchronized (Singleton.class) {
				//Lazy Loading
				if (singleton==null) {
					singleton=new Singleton();	
				}		
			}
		}

		counter++;
		System.out.println(counter);
		return singleton;
	}
	
	
}
