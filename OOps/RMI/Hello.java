package RMI;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hello extends Remote {
    void printMsg() throws RemoteException;
}
//
// Start rmiregistry
// java Server
// java CLient
