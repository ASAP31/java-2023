package s0501;

public class Car {
	String owner;
	String color;
	int    speed;
	int 	km;
	static int count;
	
	
	 Car(){
		count++;
		 System.out.println("총 차의 대수:"+count);
	}
	 Car(String name){
		 owner = name;
		 count++;
		 System.out.println("총 차의 대수:"+count);
	 }
	 Car(String name,String col,int speed){
		owner = name;
		color=col;
		this.speed = speed;
		count++;
		 System.out.println("총 차의 대수:"+count);
		
	}
	
	//생성자
	
	//메소드
	void run(){
		km =km+10;
	}
	//주행 속도를 0으로 버꾸고 
	//현재까지의 주행거리를 출력한다.
	void stop(){
		speed=0;
		System.out.println(owner + "의 차는 "+km+"을 달렸습니다.");
	}
	void speedUp(){
		speed +=5;
		System.out.println(owner + "의 차는 "+speed+"을 달렸습니다.");
	}
	void speedDown(){
		speed -=5;
		System.out.println(owner + "의 차는 "+speed+"을 달렸습니다.");
	}

	void printCarInfo(){
		System.out.println("소유자:"+owner);
		System.out.println("색상:"+color);
		System.out.println("현재속도:"+speed);
		System.out.println("주행거리:"+km);
	}
}
