package Concurrent_Utility;
import java.util.regex.*;
public class RegExpr {
	public static void main(String args[])
	{
		Pattern pat;
		Matcher mat;
		boolean found;
		pat = Pattern.compile("Java")
;
		mat = pat.matcher("Java");
		found  = mat.matches();
		System.out.println("Testing java against Java");
		if(found)
			System.out.println("Matches");
		else
			System.out.println("No Match");
		System.out.println("Testing java against Java SE 6");
		found = mat.matches();
		if(found)
			System.out.println("No Matches");
		
				
}

}
