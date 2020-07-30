package Concurrent_Utility;
import java.io.*;
import java.nio.*;
import java.nio.channels.*;

public class MappedChannelRead {
public static void main(String args[])
{
	FileInputStream fIn;
	FileChannel fChan;
	long fSize;
	MappedByteBuffer mBuf;
	try {
		fIn = new FileInputStream("test.txt");
		fChan = fIn.getChannel();
		fSize = fChan.size();
		mBuf = fChan.map(FileChannel.MapMode.READ_ONLY,0 ,fSize);

for(int  i = 0 ; i<fSize; i++)
	System.out.println((char)mBuf.get());
fChan.close();
fIn.close();

	}
	catch(IOException exc)
	{
		System.out.println(exc);
		System.exit(1);
	}
	
	
}
}
