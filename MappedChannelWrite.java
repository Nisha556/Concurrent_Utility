package Concurrent_Utility;
import java.io.*;
import java.nio.*;
import java.nio.channels.*;

public class MappedChannelWrite {
public static void main(String args[])
{
	RandomAccessFile fOut;
	FileChannel fChan;
	ByteBuffer mBuf;
	try {
		
		fOut = new RandomAccessFile("test.txt" ,"rw");
		fChan = fOut.getChannel();
		mBuf= fChan.map(FileChannel.MapMode.READ_WRITE,0,26);
		for(int i = 0 ; i<26;i++)
			mBuf.put((byte) ('A' +i));
		fChan.close();
		fOut.close();
		
		
		
		
	}
	catch(IOException e)
	{
		System.out.println(e);
		System.out.println();
		
	}
	
}
}

