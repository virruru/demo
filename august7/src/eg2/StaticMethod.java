package eg2;
import java.util.Scanner;
public class StaticMethod {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		int m1= sc.nextInt();
		int m2 = sc.nextInt();
		int m3 = sc.nextInt();
		int average = (m1+m2+m3)/3;
		System.out.println(s1+"");
		System.out.println(average);
		
	}

}
