package s0327;

import java.util.Scanner;

public class 연산자1 {
	public static void main(String[] args) {
		Scanner b= new Scanner(System.in);
		int a;
		System.out.println("숫자입력:");
		a = b.nextInt();
		
		if(a%2==0)
			System.out.println("짝수입니다");
		else
			System.out.println("홀수입니다");
	}
}