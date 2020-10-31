import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
	//to check valid mobile number//
		public static void CheckMobileNumber() {
			Scanner scan = new Scanner(System.in);
			String read = "^[0-9]{2}[ ][0-9]{10}$";
			
			System.out.println("Enter the Email:");
			String Number = scan.next();
			String text = Number;
			
			Pattern pattern = Pattern.compile(read);
			Matcher match = pattern.matcher(text);
			
			boolean result = match.matches();
			System.out.println(result);
			
			scan.close();
			
		}
}
