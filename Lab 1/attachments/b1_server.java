import java.io.*;
import java.net.*;
import java.util.*;


public class b1_server
{
	public static void main(String[] args)throws IOException
	{
		ServerSocket s=new ServerSocket(1234);
		Socket socket=s.accept();
		
		System.out.println("Client connected...");
		DataInputStream in=new DataInputStream(socket.getInputStream());
		
		System.out.println("Requesting client for date...");
		String date=in.readUTF();
		System.out.println("DATE : "+date);
		
	}
}
