package Comptes;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CompteImp extends UnicastRemoteObject implements ICompte{
private double montant;
public CompteImp() throws  RemoteException{
}
public CompteImp(double m) throws  RemoteException{
	montant=m;
}
public void Debiter (double M) throws RemoteException{
	montant+=M;
}
public void Crediter (double M) throws RemoteException{
	montant-=M;
}
public double lire_solde () throws RemoteException{
	return montant;
}
}
