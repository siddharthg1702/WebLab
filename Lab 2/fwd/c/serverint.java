import java.rmi.*;

public interface serverint extends Remote {
    int fact(int n) throws Exception;

    int add(int a, int b) throws Exception;
}
