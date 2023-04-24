import java.util.Scanner;
public class asdasd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("N:");
		int n = sc.nextInt();
		for (int a = 0; a!=n+1; a++) {
			if(a%3 == 0) continue;
			System.out.print(a + " ");
		}
	}
}
