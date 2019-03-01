import java.io.*;
import java.net.*;
import java.util.*;


public class a1_ping
{
	public static void main(String[] args)throws IOException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How many machines to be pinged ?");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			String ip=sc.next();
			InetAddress inet=InetAddress.getByName(ip);
			System.out.println("Sending ping request to... "+inet);
				
			if(inet.isReachable(5000))
				System.out.println("Host Reachable ");
			else
				System.out.println("Host NOT Reachable ");
		}
	}
}

