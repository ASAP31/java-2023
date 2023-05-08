package s0508;

public class GetSetExam {

	public static void main(String[] args) {
		Student kim = new Student();
		System.out.println(kim.getName());
		kim.setName("김예섭");
		System.out.println(kim.getName()); 
		kim.setGrade(3);
		System.out.println(kim.getName()+"은"+kim.getGrade()+"학년 입니다."); 
		
		
		
		Student lee = new Student();
		lee.setName("이예섭");
		lee.setGrade(2);
		lee.setScore(100);
		lee.printAll();
		
		
	}

}
