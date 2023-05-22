package s0522;

public class AccountMain {

	public static void main(String[] args) {
		Account a = new Account("윤서연",78954,99999999);
		a.printInfo();
		a.입금(10000);
		a.입금(900000);
		a.입금(9000000);
		a.입금(90000000);
		a.입금(999990000);
		a.입금(99910000);
		a.입금(999900100);

	}

}
