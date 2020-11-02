import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.*;

public class Registration {
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
	//to check valid mobile number//
	public static void CheckMobileNumber() {
		Scanner scan = new Scanner(System.in);
		String read = "^[0-9]{2}[ ][0-9]{10}$";
		
		System.out.println("Enter the Mobile Number:");
		String Number = scan.next();
		String text = Number;
		
		Pattern pattern = Pattern.compile(read);
		Matcher match = pattern.matcher(text);
		
		boolean result = match.matches();
		System.out.println(result);
		
		scan.close();
		
	}
	//check password with Minimum eight characters, at least one uppercase letter, one lowercase letter, one number and one special character//
	public static void CheckPassword() {
		Scanner scan = new Scanner(System.in);
		String read = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
		
		System.out.println("Enter the Password:");
		String Password = scan.next();
		String text = Password;
		
		Pattern pattern = Pattern.compile(read);
		Matcher match = pattern.matcher(text);
		
		boolean result = match.matches();
		System.out.println(result);
		
		scan.close();
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("Enter your choice to check:/n/n 1.FirstName/n 2.LastName/n 3.Email/n 4.PhoneNumber/n 5.password/n 6.Exit");
			int Option = scan.nextInt();
			switch(Option) {
				case 1:CheckFirstName();
						break;
				case 2:CheckLastName();
						break;
				case 3:	CheckEmail();
						break;
				case 4:	CheckMobileNumber();
						break;
				case 5: CheckPassword();
						break;
				case 6: System.exit(0);
						break;
				default:
						System.out.println("Wrong Input");
			}
		
		}
	}

}
