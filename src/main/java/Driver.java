import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("hitungan ke:" + counter.getCount());
		
		counter.increment();
		
		System.out.println("hitungan ke:" + counter.getCount());
		
		counter.decrement();
		
		System.out.println("hitungan ke:" + counter.getCount());
		
	}

}
