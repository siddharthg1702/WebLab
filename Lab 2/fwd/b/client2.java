import java.io.*;

import java.rmi.*;

public class client2 {

    public static void main(String args[]) throws Exception {
        try {
            String s = "rmi://" + args[0] + "/abc";

            serverint f = (serverint) Naming.lookup(s);

            DataInputStream m = new DataInputStream(System.in);

            int n1 = Integer.parseInt(m.readLine());
            int n2 = Integer.parseInt(m.readLine());

            System.out.println("the addition is : " + f.add(n1, n2));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}