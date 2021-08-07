package eg2;
class Company
{
	String name;
	int id;
	double salary;
	public void emply() 
	{
	System.out.println(id);
	System.out.println(salary);
	System.out.println(name);
	}



	public  static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Company obj1 = new Company();
		Company obj2 = new Company();
		obj1.id =8;
		obj1.name="Naveen";
		obj1.salary=100000;
		obj2.id =9;
		obj2.name="Narendra";
		obj2.salary=100000;
		obj1.emply();
		obj2.emply();

	}
}


