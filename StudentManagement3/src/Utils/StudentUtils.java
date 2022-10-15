package Utils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static java.time.LocalDate.*;
import static com.app.core.subject.*;

import com.app.core.Student;
import com.app.core.address;

public class StudentUtils {
	
	public static HashMap<Integer, Student> populateMap()
	{
		HashMap<Integer, Student> HM = new HashMap<>();
		
		HM.put(10, new Student(10, "Prathmesh", parse("1998-03-06"), JAVA, 6.49));
		HM.put(15, new Student(15, "Omkar", parse("1997-04-03"), JAVA, 6.35));
		HM.put(25, new Student(25, "Alankar", parse("1998-01-04"), CPP, 7.01));
		HM.put(12, new Student(35, "Ram", parse("1997-01-07"), AWS, 8.02));
		HM.put(35, new Student(40, "Shyam", parse("1996-07-24"), UI, 4.49));
		HM.put(19, new Student(17, "Yash", parse("1996-06-28"), OOPS, 5.92));
		
		List<address> Add = Arrays.asList(
				new address("Panvel", "MH", "1234525"),
				new address("Uran", "MH", "6743672"),
				new address("KhandaC", "MH", "912864"),
				new address("Karjat", "MH", "0927411"),
				new address("Pune", "MH", "87342612"),
				new address("Kolhapur", "MH", "89762142")
				);
		
		int i=0;
		for(Student s : HM.values())
			s.assignAddress(Add.get(i++));
		return HM;
	}

}
