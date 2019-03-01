import java.io.*;
import java.net.*;
import java.util.*;

public class Ping
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		int n = 5;

		for (int i = 0; i < n; i++)
		{
			System.out.print("Enter IP Address : ");
			String ip = sc.next();
			InetAddress inet = InetAddress.getByName(ip);
			System.out.println("Sending ping request to... " + inet);

			if (inet.isReachable(5000))
				System.out.println("Host Reachable ");
			else
				System.out.println("Host NOT Reachable ");
		}
	}
}
