package Task4;
/*
 * This program for:
 * 1) Writing content to binary file
 * 2) Reading binary file to screen
 */
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * author : Azhari Hj Salleh
 * matrix no : 201461166
 * email : azhari.salleh@gmail.com
 * github acct : https://github.com/azharisalleh
 * 
 */

public class Person implements Serializable {
	public String name;
	public int matrix_no;
	public String gender;
	public int age;
	public String email;
	public int mobile_no;
	
	//public ObjectOutputStream os;
}
