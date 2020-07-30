package Concurrent_Utility;
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
public class ExplicitChannelRead {
public static void main(String args[])
{
	FileInputStream fIn;
	FileChannel fChan;
	long fSize;
	ByteBuffer mBuf;
	try  {
	fIn = new FileInputStream("test.txt");
	fChan = fIn.getChannel();
			
			fSize =fChan.size() ;
			mBuf=ByteBuffer.allocate((int)fSize);
			fChan.read(mBuf);
			for(int i =0; i<fSize;i++)
				System.out.println((char)mBuf.get());
			System.out.println();
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