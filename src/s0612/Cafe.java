package s0612;

public class Cafe {
	private int coffee;
	private int suger;
	private int cream;
	private static int count =0;
	
	int getCount() {
		retrun count;
	}
	void setCount(int count) {
		this.count = count;
	}
	
	public void makeTea(int coffee) {
		count++;
		this.coffee =coffee;
		System.out.println("블랙커피"+coffee);
		
		}
	public void makeTea(int suger,int coffee) {
		count++;
		this.coffee = coffee;
		this.suger= suger;
		
		System.out.println("설탕커피"+(coffee+suger));
	}
	public void makeTea(int cream,int suger,int coffee) {
		count++;
		this.coffee = coffee;
		this.suger= suger;
		this.cream= cream;
		System.out.println("크림커피"+(coffee+suger+cream));
	}
	
	
	public void printCount() {
		System.out.println("총 판매 수량:"+count);
	}
	
	
	

}
