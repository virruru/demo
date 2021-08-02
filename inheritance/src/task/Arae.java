package task;
class square{
	public int square(int x) {
		return x*x;
	}
}
class rectangle extends square{
	public int rectangle(int x,int y) {
		return x*y;
	}
}
class trapezium extends rectangle{
	public double trapezium(int x,int y,int z)
	{
		return (double)((x+y)*z)/2;
	}
}
public class Arae {

	public static void main(String[] args) {
		trapezium q = new trapezium();
		System.out.println(q.square(2));
		System.out.println(q.rectangle(2,4));
		System.out.println(q.trapezium(2,4,6));
		
		

	}

}
