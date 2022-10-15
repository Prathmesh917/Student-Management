package Utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import com.app.core.Student;
import static java.time.LocalDate.*;
import static com.app.core.subject.*;

public class BinaryIOutils {
	
	//add a static method to write student detail
	
	public static void SaveStudentData(Student S, String filename) throws IOException
	{
		//Chain -- JavaAplictn-->DataOutputStream-->FileOutputStrean-->FileName
		try(ObjectOutputStream OutStrm = new ObjectOutputStream(new FileOutputStream(filename))
				)
		{
		 //all write primitive data method gone
			OutStrm.writeObject(S);
		 
		} 
	}
	
	public static void SaveStudentMapData(HashMap<Integer, Student> StudentMap, String filename) throws IOException
	{
		//Chain -- JavaAplictn-->DataOutputStream-->FileOutputStrean-->FileName
		try(ObjectOutputStream OutStrm = new ObjectOutputStream(new FileOutputStream(filename))
				)
		{
		 //all write primitive data method gone
			OutStrm.writeObject(StudentMap);
		 
		} 
	}
	
	public static Student RestoreStudentDetail(String fileName)throws IOException
	{
		//How to check if file is present or not
		//Check via java.io.File
		//Create File instance
		File F = new File(fileName);
		if(F.exists()&&F.isFile()&&F.canRead())
		{
			//curser is here so redable file is exists.
		try(DataInputStream DIS = new DataInputStream(new BufferedInputStream(new FileInputStream(fileName)))) 
		{
			return new Student(DIS.readInt(), DIS.readUTF(), parse(DIS.readUTF()), valueOf(DIS.readUTF()), DIS.readDouble());
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		}
		return null;
	}
		//Write a method to read Map of Student	
	@SuppressWarnings("unchecked")
	public static HashMap<Integer, Student> RestoreStudentMapDetail(String fileName)throws IOException
		{
			//How to check if file is present or not
			//Check via java.io.File
			//Create File instance
			File F = new File(fileName);
			if(F.exists()&&F.isFile()&&F.canRead())
			{
				//curser is here so redable file is exists.
			try(ObjectInputStream OIS = new ObjectInputStream(new FileInputStream(fileName))) 
			{
				return (HashMap<Integer, Student>)OIS.readObject(); // De-serealization happnes
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
			}
			//if file dose not exists return empty map
			return new HashMap<Integer, Student>();	
	}	
	}


