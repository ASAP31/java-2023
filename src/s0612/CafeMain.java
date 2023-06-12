package s0612;

public class CafeMain {

	public static void main(String[] args) {
		Cafe c = new Cafe();
		c.makeTea(11);
		c.makeTea(2,3);
		c.makeTea(4,5,10);
		c.printCount();
		
		Cafe c2 = new Cafe();
		c.makeTea(1);
		c.makeTea(2,3);
		c.makeTea(3,4,2);
		
		c.printCount();

	}

}
