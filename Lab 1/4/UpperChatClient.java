import java.io.*;
import java.util.*;
import java.net.*;

public class UpperChatClient
{
    public static void main(String args[])
    {
        try
        {
            Socket socket = new Socket("localhost", 9876);
            System.out.println("Connected to server");

            DataInputStream in=new DataInputStream(socket.getInputStream());
            DataOutputStream out=new DataOutputStream(socket.getOutputStream());

            Scanner sc = new Scanner(System.in);
            
            while(true)
            {
                System.out.print("Enter message for server : ");
                String msg = sc.nextLine();
                
                out.writeUTF(msg);
                
                System.out.println("Message Recieved : " + in.readUTF());

                if(msg.equals("exit"))
                    break;
            }
            System.out.println("Server disconnected");
            out.close();
            socket.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}