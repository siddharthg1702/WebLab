
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;

public class clientC {

    public static void main(String[] args) {
        try {
            servercmd c = (servercmd) Naming.lookup("rmi://localhost/CalculatorService");
            System.out.println("Calculator");
            System.out.println("SUBTRACTION 4-2 =" + c.sub(4, 2));
            System.out.println("ADDITION 4+2 =" + c.add(4, 2));
            System.out.println("MULTIPLICATION 4*2=" + c.mul(4, 2));
            System.out.println("DIVISION 4/2=" + c.div(4, 2));
        } catch (MalformedURLException murle) {
            System.out.println();
            System.out.println("MalformedURLException");
            System.out.println(murle);
        } catch (RemoteException re) {
            System.out.println();
            System.out.println("RemoteException");
            System.out.println(re);
        } catch (NotBoundException nbe) {
            System.out.println();
            System.out.println("NotBoundException");
            System.out.println(nbe);
        } catch (java.lang.ArithmeticException ae) {
            System.out.println();
            System.out.println("java.lang.ArithmeticException");
            System.out.println(ae);
        }
    }
}
