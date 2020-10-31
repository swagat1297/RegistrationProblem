import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
	public static void CheckPassword() {
		Scanner scan = new Scanner(System.in);
		String read = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
		
		System.out.println("Enter the Email:");
		String Password = scan.next();
		String text = Password;
		
		Pattern pattern = Pattern.compile(read);
		Matcher match = pattern.matcher(text);
		
		boolean result = match.matches();
		System.out.println(result);
		
		scan.close();
		
	}

}
