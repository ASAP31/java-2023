package s0522;

public class Account {
	private String name;
	private int no;
	private int balance;
	
	public Account() {}
	public Account(String name,int no) {
		this.name = name;
		this.no = no;
	}
	public Account(String name,int no,int balance) {
		this.name = name;
		this.no = no;
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	void printInfo() {
		System.out.println("[계좌정보]예금주:"+name);
		System.out.println("계좌번호:"+no);
		System.out.println("현재잔고:"+balance);
		System.out.println("==========================================================");
	}
	void 입금(int money) {
		balance +=money;
		System.out.println(name + "님 "+money+" 원 입금하여 현재 잔액이"+balance+"원입니다.");
	}
	void 출금(int money) {
		if(money<balance) {
			balance -=money;
			System.out.println(name + "님 "+money+" 원 출금하여 현재 잔액이"+balance+"원입니다.");
			
		}else {
			System.out.println("잔액이 부족합니다.");
		}
		
				
	}
	

}
