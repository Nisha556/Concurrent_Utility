package Concurrent_Utility;
import java.util.regex.*;

public class RegExpr6 {
public static void main(String args[])
{
	Pattern pat = Pattern.compile("e.+?d");
	Matcher mat = pat.matcher("extend cup end table");
	while(mat.find())
		System.out.println("Match : " +mat.group());
}
}
