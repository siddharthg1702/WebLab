import java.io.*;
import java.net.*;
import java.util.*;


public class b1_client
{
	public static void main(String[] args)throws IOException
	{
		Socket socket=new Socket("localhost",1234);
		System.out.println("Connected...");
		
		DataOutputStream out=new DataOutputStream(socket.getOutputStream());
		System.out.println("Request received...");
		
		Date d=new Date();
		out.writeUTF(d.toString());		
		System.out.println("Request granted...");
	}
}
