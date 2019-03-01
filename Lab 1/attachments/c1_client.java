import java.io.*;
import java.net.*;
import java.util.*;


public class c1_client
{
	public static void main(String[] args)throws IOException
	{
		//Socket socket=new Socket("192.168.117.91",1234);
		Socket socket=new Socket("localhost",1234);
		System.out.println("Connected...");
		
		//DataInputStream in=new DataInputStream(new BufferedInputStream(socket.getInputStream()));
		DataInputStream in=new DataInputStream(socket.getInputStream());
		DataOutputStream out=new DataOutputStream(socket.getOutputStream());
		System.out.println("Sending message...");
		
		Scanner sc=new Scanner(System.in);
		String msg="";
		
		System.out.println("Enter word...");
		msg=sc.next();
		//out.writeUTF(msg);
			
		while(!msg.equals("exit"))
		{
			//System.out.println("Enter word...");
			out.writeUTF(msg);
			msg=sc.next();
		
			
			out.flush();		
			String msg1=in.readUTF();
			
			
			System.out.println("Message Received... "+msg1);
		}
	}
}
