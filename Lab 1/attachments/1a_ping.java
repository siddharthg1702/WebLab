import java.io.*;
import java.net.*;

public class a1_ping
{
	public static void main(String[] args)throws IOException
	{
		String ip1="127.0.0.1";
		InetAddress inet=InetAddress.getByName(ip1);
		
		if(inet.isReachable(5000))
			System.out.println("Host Reachable");
		else
			System.out.println("Host NOT Reachable");
	}
}