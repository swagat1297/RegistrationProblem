import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class firstname {

	//to check valid first name//
		public static void CheckFirstName() {
			Scanner scan = new Scanner(System.in);
			String read = "[A-Z][a-z]{3,}";
			
			System.out.println("Enter the first name:");
			String firstName = scan.next();
			String text = firstName;
			
			Pattern pattern = Pattern.compile(read);
			Matcher match = pattern.matcher(text);
			
			boolean result = match.matches();
			System.out.println(result);
			
			scan.close();
			
		}
}
