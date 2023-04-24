package s0403;

import java.util.Scanner;

public class 반복문1 {
public static void main(String[] args) {
	int n;
	int sum = 0;
	System.out.println("n을 입력해주세요");
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	
	for(int i =1 ; i<=n;i++)
		if(i%2 ==0){
			sum = sum - i;
			System.out.println("-"+sum);
		}
		else {
			sum+= i;
			System.out.println("+"+sum);
			
			
		}
	System.out.println("="+sum);
			
		
			
	
}
}
