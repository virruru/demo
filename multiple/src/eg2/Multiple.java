package eg2;

import eg2.MultipleI.DemoClass;
import eg2.MultipleI.FirstInterface;
import eg2.MultipleI.SecondInterface;
public class  
{
	interface FirstInterface 
	{
		  public void myMethod(); // interface method
		}

		interface SecondInterface 
		{
		  public void myOtherMethod(); // interface method
		}

		
		class DemoClass implements FirstInterface, SecondInterface  // DemoClass "implements" FirstInterface and SecondInterface by using the comma we can implement the multiple implement in java
		{
		  public void myMethod() 
		  {
		    System.out.println("hii");
		  }
		  public void myOtherMethod() {
		    System.out.println("hello");
		  }
		}

public class Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoClass myObj = new DemoClass();
	    myObj.myMethod();
	    myObj.myOtherMethod();

	}
}


