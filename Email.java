import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
	//to check valid email//
		public static void CheckEmail() {
			Scanner scan = new Scanner(System.in);
			String read = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*[@][0-9A-Za-z]+([.][a-zA-Z]{2,4})*$";
			
			System.out.println("Enter the Email:");
			String Email = scan.next();
			String text = Email;
			
			Pattern pattern = Pattern.compile(read);
			Matcher match = pattern.matcher(text);
			
			boolean result = match.matches();
			System.out.println(result);
			
			scan.close();
			
		}

}
