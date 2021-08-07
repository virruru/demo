package eg01;
import java.util.Scanner;
public class Multiplication {

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		for(int i=1;i<=10;i++)
		{
			int c= i*N;
			System.out.println(N*i);
		}
	}

}
