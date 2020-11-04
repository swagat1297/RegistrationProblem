package Testing;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailSamples {
	public static void EmailSamplelist() {
		ArrayList<String> Sample = new ArrayList<String>();
		
		Sample.add("abc@yahoo.com");
		Sample.add("abc-100@yaahoo.com");
		Sample.add("abc.100@yahoo.com");
		Sample.add("add111@abc.com");
		Sample.add("abc-100@abc.net");
		Sample.add("abc.100@abc.com.au");
		Sample.add("abc@1.com");
		Sample.add("abc@gmail.com.com");
		
		for(int i=0; i<Sample.size();i++) {
		String read = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*[@][0-9A-Za-z]+([.][a-zA-Z]{2,4})*$";	
			
		Pattern pattern = Pattern.compile(read);
		Matcher match = pattern.matcher(Sample.get(i));
		
		boolean result = match.matches();
		System.out.println("the mail " + Sample.get(i) + "is " + result);;
		}
		
		
	}

}
