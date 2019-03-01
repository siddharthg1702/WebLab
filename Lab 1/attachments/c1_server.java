import java.io.*;
import java.net.*;
import java.util.*;


public class c1_server
{
	public static void main(String[] args)throws IOException
	{
		ServerSocket s=new ServerSocket(1234);
		Socket socket=s.accept();
		
		System.out.println("Client connected...");
		DataInputStream in=new DataInputStream(new BufferedInputStream(socket.getInputStream()));
		DataOutputStream out=new DataOutputStream(socket.getOutputStream());
		
				

		
		while(true)
		{
			String msg=in.readUTF();	
			System.out.println("HI");	
			if(msg.equalsIgnoreCase("ping"))
			{
				out.writeUTF("PONG");
				out.flush();
				System.out.println("Message Received "+msg);
			}
		}	
	}
}
