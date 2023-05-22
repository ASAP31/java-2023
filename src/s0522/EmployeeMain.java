package s0522;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setName("윤서연 이예섭 여친");
		e1.setNo(12345);
		e1.setAge(21);
		System.out.println(e1.toString());
		
		
		
		Employee e2 = new Employee("이지우 짱 예쁘다",23450,19);
		System.out.println(e2.toString());
	}

}
