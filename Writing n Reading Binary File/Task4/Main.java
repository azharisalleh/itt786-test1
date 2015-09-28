package Task4;
/*
 * This program for:
 * 1) Writing content to binary file
 * 2) Reading binary file to screen
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * author : Azhari Hj Salleh
 * matrix no : 201461166
 * email : azhari.salleh@gmail.com
 * github acct : https://github.com/azharisalleh
 * 
 */
public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		/*public String name;
		public int matrix_no;
		public String gender;
		public int age;
		public String email;
		public int mobile_no;*/
		
		/*
		 * Write Binary File azhari.bin
		 */
		
		Person azhari = new Person();
		azhari.name="Azhari bin Hj Salleh";
		azhari.matrix_no=2014461166;
		azhari.gender="Male";
		azhari.age=40;
		azhari.email="azhari.salleh@gmail.com";
		azhari.mobile_no=0136661700;
		
		System.out.println("Start Writing Binary File azhari.bin");
		String filename="azhari.bin";
		try {
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(filename));
			//azhari.os = os;
			os.writeObject(azhari);
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Done Writing");
		System.out.println("--------------------------------");
		
		/*
		 * Read Binary File azhari.bin
		 */
		System.out.println("Start Reading Binary File azhari.bin");
		try {
			ObjectInputStream is = new ObjectInputStream(new FileInputStream(filename));
			Person p = (Person) is.readObject();
			System.out.println("Read Name = "+p.name);
			System.out.println("Read Matrix No = "+p.matrix_no);
			System.out.println("Read Gender = "+p.gender);
			System.out.println("Read Age = "+p.age);
			System.out.println("Read Email = "+p.email);
			System.out.println("Read Mobile No = "+p.mobile_no);
			is.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
}
