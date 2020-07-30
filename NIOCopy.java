package Concurrent_Utility;
import java.io.*;
import java.nio.*;
import java.nio.channels.*;


public class NIOCopy {
public static void main(String args[])
{
	FileInputStream fIn;
	FileOutputStream fOut;
	FileChannel fIChan ,fOChan;
	long fSize;
	MappedByteBuffer mBuf;
	try {
		fIn = new FileInputStream(args[0]);
		fOut = new FileOutputStream(args[1]);
		fIChan = fIn.getChannel();
		fOChan = fOut.getChannel();
		fSize = fIChan.size();
		mBuf = fIChan.map(FileChannel.MapMode.READ_ONLY,0,fSize);
		fOChan.write(mBuf);

		fIChan.close();
		fIn.close();
		fOChan.close();
		fOut.close();
		
	}
	catch(IOException e)
	{
		System.out.println(e);
		System.out.println();
	}
	catch(ArrayIndexOutOfBoundsException ee)
	{
		System.out.println(ee);
	}
}
}
