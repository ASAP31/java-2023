package s0501;

public class CarMain {

	public static void main(String[] args) {
		Car myCar= new Car();
		Car yourCar= new Car();
		myCar.owner = "예섭";
		myCar.speed=0;
		myCar.color="보라색";
		myCar.printCarInfo();
		myCar.run();
		myCar.run();
		myCar.speedUp();		
		myCar.speedUp();		
		myCar.speedUp();
		myCar.stop();
	
	}

}
