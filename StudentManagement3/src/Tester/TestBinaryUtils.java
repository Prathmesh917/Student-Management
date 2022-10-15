package Tester;

import java.util.Scanner;

import com.app.core.Student;
import com.app.core.address;

import static com.app.core.subject.*;
import static java.time.LocalDate.*;
import static Utils.BinaryIOutils.*;


public class TestBinaryUtils {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) 
		{
		System.out.println("Enter file name");
		String file = sc.nextLine();
		Student S = new Student(111, "Kartik", parse("1996-04-23"), JAVA, 4.3);
		S.assignAddress(new address("Yellampur", "Karnatak", "3961287"));
		SaveStudentData(S, file);
		System.out.println("Data stored");		
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Main over");
	}

}
