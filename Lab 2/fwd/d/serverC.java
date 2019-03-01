
import java.rmi.Naming;

public class serverC {

  public serverC() {
    try {
      servercmd c = new servercmdimpl();
      Naming.rebind("rmi://localhost:1099/CalculatorService", c);
    } catch (Exception e) {
      System.out.println("Trouble: " + e);
    }
  }

  public static void main(String args[]) {
    new serverC();
  }
}
