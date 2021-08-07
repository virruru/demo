package eg2;

public class Method {
	public void addition(int x,int y)
	{
		System.out.println(x+y);
	}
	public void addition(int x,int y,int z) {
		System.out.println(x+y+z);
	}
	public void addition(int...is)
	{
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method obj = new Method();
		obj.addition(5, 10);
		obj.addition(10, 13,17);
		obj.addition(12,33,55,66);
		

	}

}
