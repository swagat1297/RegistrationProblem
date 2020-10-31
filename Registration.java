import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.*;

public class Registration {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String re = "[A-Z][a-z]";
		
		System.out.println("Enter the first name:");
		String firstName = scan.next();
		String text = firstName;
		
		Pattern pt = Pattern.compile(re);
		Matcher mt = pt.matcher(text);
		
		boolean result = mt.matches();
		System.out.println(result);
		
		scan.close();
		
		
	}

}
