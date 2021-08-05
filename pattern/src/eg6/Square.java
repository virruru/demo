package eg6;
import java.util.Scanner;
public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		for (int i = 1; i <=N; i++) {
			for (int j = 1; j <= i-1; j++) {
				System.out.print(""+i);
				
			}
			System.out.print("\n");
			
		}
		

	}

}
