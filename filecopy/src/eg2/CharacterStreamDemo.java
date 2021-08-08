package eg2;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class CharacterStreamDemo {
	
	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("C:\\Users\\hp\\Pictures\\Camera Roll");
			BufferedReader br = new BufferedReader(reader);
			BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\notes.txt"));
			/*int character = reader.read();
			while (character != -1) {
				System.out.print((char) character);
				character = reader.read();
			}*/
			
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				bw.write(line);
				bw.newLine();
				line = br.readLine();
			}
			
			br.close();			
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// Task 1 - Create file copy of an image.
	//          InputStream -> FileInputStream, BufferedInputStream
	//          OutputStream - FileOutputStream, BufferedOutputStream

}
