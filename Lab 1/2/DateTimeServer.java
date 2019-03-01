import java.net.*;
import java.io.*;
import java.util.*;

class DateTimeServer
{
    public static void main(String args[]) throws Exception
    {
        ServerSocket s=new ServerSocket(9876);
        System.out.println("Server running on port 9876...");
        System.out.println("Waiting For Connection ...");
        
        Socket soc=s.accept();
        System.out.println("Client Connected");
        
        DataOutputStream out=new DataOutputStream(soc.getOutputStream());
        out.writeBytes("Server Date: " + (new Date()).toString() + "\n");
        System.out.println("Data Sent");
        System.out.println("Server Disconnecting");
        out.close();
        soc.close();
    }
}
