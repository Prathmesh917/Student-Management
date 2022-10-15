package Tester;

import static Utils.BinaryIOutils.RestoreStudentMapDetail;

//Inserted populate map from utils -- to use in line 21 (populate map)

import java.util.HashMap;
import java.util.Scanner;

import com.app.core.Student;


public class TestDe_SerializationMap {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) 
		{
		System.out.println("Enter binary file to restore");
		     HashMap<Integer, Student> Map = RestoreStudentMapDetail(sc.nextLine());
		     //display Map 
		     for(Student s : Map.values())
		    	 System.out.println(s);
		  // Map.forEach((i,s)->System.out.println(i+" "+s)); 
		}      
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Main over");
	}

}
