import java.rmi.*;
import java.rmi.registry.*;

public class Server {

    public static void main(String args[]) {
        try {

            DNS stub = new DNSRemote();
            Naming.rebind("rmi://localhost:5000/sonoo", stub);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}