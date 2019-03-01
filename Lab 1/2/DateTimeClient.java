import java.io.*;
import java.net.*;

public class DateTimeClient
{
    public static void main(String args[]) throws Exception
    {
        Socket soc=new Socket(InetAddress.getLocalHost(),9876);        

        System.out.println("Connection established\n");

        BufferedReader in=new BufferedReader(new InputStreamReader(soc.getInputStream()  ));
        System.out.println(in.readLine());
    }    
}