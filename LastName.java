import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastName {
	//to check valid last name//
		public static void CheckLastName() {
			Scanner scan = new Scanner(System.in);
			String read = "[A-Z][a-z]{3,}";
			
			System.out.println("Enter the Last name:");
			String lastName = scan.next();
			String text = lastName;
			
			Pattern pattern = Pattern.compile(read);
			Matcher match = pattern.matcher(text);
			
			boolean result = match.matches();
			System.out.println(result);
			
			scan.close();
			
		}

}
