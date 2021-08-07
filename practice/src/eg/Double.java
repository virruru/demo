package eg;
import java.util.*;



public class Double 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add (20);
		numbers.add (30);
		
	System.out.println("using for loop: ");
	for (Integer number : numbers)
	{
		System.out.println(number);
	}
	numbers.forEach(e-> System.out.println(e));
	numbers.forEach(System.out::println);
	}
}
