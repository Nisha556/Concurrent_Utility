package Concurrent_Utility;
import java.util.regex.*;
public class RegExpr9 {
public static void main(String args[])
{
	Pattern pat = Pattern.compile("[,.!]");
	String strs[] = pat.split("Oner two , alpha9 12!done.")
;
	for(int i = 0 ; i<strs.length; i++)
		System.out.println("Next token :" + strs[i]);
	}
}
