package string;
import java.util.Scanner;
public class MiddleCharactre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String h="hello revature well for being training us";
		System.out.println(stringMod(h));
	}
		public static String stringMod(String h){
			
		String[] s=h.split(" ");
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length;i++) {
			sb.append(s[i].substring(0,s[i].length()-1));
			sb.append(Character.toUpperCase(s[i].charAt(s[i].length()-1)));
			sb.append(" ");
			
		
		}
		
		return sb.toString().trim();

		
		
		

	}

}
