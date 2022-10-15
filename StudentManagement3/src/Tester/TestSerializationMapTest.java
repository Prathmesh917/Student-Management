package Tester;

import static Utils.BinaryIOutils.SaveStudentMapData;
import static Utils.StudentUtils.populateMap;

//Inserted populate map from utils -- to use in line 21 (populate map)

import java.util.HashMap;
import java.util.Scanner;

import com.app.core.Student;


public class TestSerializationMapTest {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) 
		{
		System.out.println("Enter file name");
		String file = sc.nextLine();
		HashMap<Integer , Student> studHashMap = populateMap();
		SaveStudentMapData(studHashMap, file);
		System.out.println("Data stored");
		
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Main over");
	}

}
