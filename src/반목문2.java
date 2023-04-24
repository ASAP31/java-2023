
public class 반목문2 {

	public static void main(String[] args) {
		
		for(int i=0; i<=4;i++)
		{
			for(int j =1;j<=5;j++)
				System.out.print(j+"\t");
			System.out.println();
		}
		System.out.println("----------예쩨28-------------");
		{
			for(int i=0; i<=4;i++)
			{
				for(int j =1;j<=i+1;j++)
					System.out.print(j+"\t");
				System.out.println();
			}
			System.out.println("----------예쩨30-------------");
			
				for(int i=0; i>=2;i--)
			
			{
				for(int j =1;j<=i;j++)
					System.out.print("*"+"\t");
				System.out.println();
			}
		}
	}

}
