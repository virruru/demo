package eg01;
import java.util.Scanner;
public class Trainagle {
	public static void main(String args[]) {
		Scanner s= new Scanner(System.in);
		int N = s.nextInt();
		for(int i=1; i<=N; i++)
		{
			for(int j=0; j<=i-1; j++) 
			{
				
			System.out.print(+i-1);
			}
			System.out.print("\n");
		}
		
		
	}

}
