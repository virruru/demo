package eg2;

public class MultipleI {
	interface FirstInterface {
		  public void myMethod(); // interface method
		}

		interface SecondInterface {
		  public void myOtherMethod(); // interface method
		}

		
		class DemoClass implements FirstInterface, SecondInterface  // DemoClass "implements" FirstInterface and SecondInterface by using the comma we can implement the multiple implement in java
		{
		  public void myMethod() {
		    System.out.println("hii");
		  }
		  public void myOtherMethod() {
		    System.out.println("hello");
		  }
		}

		class MyMainClass {

	public static void main(String[] args) {
		DemoClass myObj = new DemoClass();
	    myObj.myMethod();
	    myObj.myOtherMethod();
	}

	}

}
