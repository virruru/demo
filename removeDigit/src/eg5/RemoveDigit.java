package eg5;
import java.util.Scanner;
public class RemoveDigit {

	public static void main(String[] args) {
		int m=0;
		Scanner sc =new Scanner(System.in);
		String s = sc.nextLine();
		String arr[] = s.split(" ");
		String a[] = new String[arr.length];
		for (int i = 0; i < a.length; i++) {
			int k= arr[i].length();
			if(k==1)
			{
				continue;
			}
			String s1 =arr[i];
			if(s1.charAt(0)!=(s1.charAt(k-1)))
			{
				a[m++]=arr[i];
			}
			
		}
		for(int i=0;i<m;i++)
		{
			System.out.println(a[i]+" ");
		}
		
		
		

	}

}
