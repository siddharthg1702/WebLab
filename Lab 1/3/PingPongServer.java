import java.io.*;
import java.net.*;

public class PingPongServer
{
    public static void main(String args[])
    {
        try
        {
            ServerSocket server = new ServerSocket(9876);
            System.out.println("Server running in port 9876...");
            System.out.println("Waiting for client to connect...");

            Socket socket=server.accept();
            System.out.println("Client connected\n\n");

            DataInputStream in=new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            DataOutputStream out=new DataOutputStream(socket.getOutputStream());
            
            while(true)
            {
                String msg = in.readUTF();
                if(msg.equals("Ping"))
                {
                    System.out.println("Replying for Ping message");
                    out.writeUTF("Pong");
                }
                if(msg.equals("exit"))
                    break;
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}