package Concurrent_Utility;
import java.text.*;
import java.util.*;
public class SimpleDateFormatDemo {
	public static void main(String args[])
	{
		Date date = new Date();
		SimpleDateFormat sdf;
		sdf = new SimpleDateFormat("hh:mm:ss");
		System.out.println(sdf.format(date));
		sdf = new SimpleDateFormat("dd MMM yyy hh:mm:ss:zzz");
		System.out.print(sdf.format(date));
		sdf = new SimpleDateFormat("E MMM dd yyyy");
		System.out.println(sdf.format(date));
		
	}

}
