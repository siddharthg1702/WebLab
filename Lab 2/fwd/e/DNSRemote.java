import java.rmi.*;
import java.rmi.server.*;
import java.io.*;
import java.net.*;
import java.util.*;

public class DNSRemote extends UnicastRemoteObject implements DNS{

DNSRemote()throws RemoteException{
//super();
}

public int find(String x){
try{
		InetAddress ad = java.net.InetAddress.getByName(x);
		String address = ad.getHostAddress();
		System.out.println(address);
	}
catch(Exception e)	{
	System.out.println(e);
}
  return 0;

}

}
