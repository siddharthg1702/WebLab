import java.rmi.*;
public interface DNS extends Remote{

public int find(String x)throws RemoteException;
}
