package eg1;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bussinessvalid b1=new Bussinessvalid();
		
	      
	    
			
		try {
			if(b1.isValidEmail("in")) {
				System.out.println("eMAIL VALIDATED");
			}
		} catch (InvalidEmailException e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
		}
		
//	} catch (InvalidAgeException e) {
	//	System.out.println(e.getMessage());
	//}
	
	
	try {
		if(b1.isValidPassword("ABCDE1222Q")) {
			System.out.println("Password Validated");}
	} catch (InvalidPassException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
	
			try {
				if(b1.isValidAdhar("590380049774")) {
					System.out.println("Adhar Validated");}
			} catch (InvalidAdharException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		
	//}catch(InvalidPanException e){
		//System.out.println(e.getMessage());
	//}


		}



	}


