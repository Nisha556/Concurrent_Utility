package Concurrent_Utility;
import java.util.regex.*;

public class RegExpr7 {
public static void main(String args[])
{
	Pattern pat =Pattern.compile("[a-z]+");
	Matcher mat = pat.matcher("this is a test.");
	while(mat.find())
		System.out.println("Match :" + mat.group());
}
}
