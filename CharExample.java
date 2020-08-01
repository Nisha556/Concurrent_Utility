package Concurrent_Utility;
import java.util.regex.*;

public class CharExample {
public static void main(String rgs[])
{
	System.out.println(Pattern.matches("[xyz]" , "abcd"));
	System.out.println(Pattern.matches("[xyz]","x" ));
	System.out.println(Pattern.matches("[xyz]", "xyyyyz"))
;
	
	
}
}
