package Concurrent_Utility;
import java.util.regex.*;
public class RegExpr4 {
public static void main(String ars[])
{
	Pattern pat = Pattern.compile("W+");
	Matcher mat = pat.matcher("W WW WWW");
	while(mat.find())
		System.out.println("Match:" +mat.group());
	
}
}

