import java.rmi.*;
import java.io.*;
import java.io.*;
import java.net.*;
import java.util.*;

public class Client {

	public static void main(String args[]) {
		try {
			Scanner in = new Scanner(System.in);
			DNS stub = (DNS) Naming.lookup("rmi://localhost:5000/sonoo");
			System.out.println("Enter the DOMAIN NAME :");
			String str = in.next();
			stub.find(str);
		}

		catch (Exception e) {
			System.out.println(e);
		}
	}

}
