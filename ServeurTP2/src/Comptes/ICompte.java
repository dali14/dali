package Comptes;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public interface ICompte {
public void Debiter(double montant) throws RemoteException;
public void Crediter(double montant) throws RemoteException;
public double lire_solde() throws RemoteException;
}
