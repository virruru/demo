package eg3;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
public class Vowel 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s = "hey hello everyone its getting complicated right that's why we should wrap up the tasks given on same day but we rarely stick to it sad";
		System.out.println("array: ");


		Map<Integer, String> map = new TreeMap<>();
		String arr[]=s.split(" ");
		
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
			System.out.println("count: " +i);
			
		if(arr.length >=2) 
		{
			if(str.charAt(i)==a || str.charAt(i)==e || str.charAt(i) == i || str.charAt(i)==o || str.charAt(i)== u)
				System.out.println("Given string contains " str.chrAt(i)+"at the index"+i);
			
		}
		}
	}

