package s0508;

public class Student {
	private String name="이름 없음";
	private int grade ;
	private float score ;
	
	static int count = 0;
	static String SchoolName = "로봇고";
	static final float PI = 3.141592f;
	
	
	Student(){
		count++;
		
	}

	void setName(String n) {
		name = n;
		
	}
	String getName(){
		return name ;
		
	}
	void setGrade(int g) {
		grade = g;
	}
	int getGrade() {
		return grade;
	}
	void setScore(float s) {
		score =s;
	}
	float getScore() {
		return score;
	}
	void printAll() {
		System.out.println(getName()+getGrade()+":"+getScore());
	}
}
