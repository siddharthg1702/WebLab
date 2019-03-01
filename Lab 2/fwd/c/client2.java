import java.io.*;

import java.rmi.*;

public class client2 {

    public static void main(String args[]) throws Exception {
        try {
            String s = "rmi://" + args[0] + "/abc";

            serverint f = (serverint) Naming.lookup(s);

            DataInputStream m = new DataInputStream(System.in);

            System.out.print("Enter the number of factorial to be found : ");
            int n1 = Integer.parseInt(m.readLine());

            System.out.println("the factorial of "+n1+" is" + f.fact(n1));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
