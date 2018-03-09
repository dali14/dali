package Models;

import java.rmi.RemoteException;

public interface Icomptem{
	public ArrayList<Compte> AfficherListe();
	
	
		public void AjouterCompte (Compte c) throws RemoteException;
		public void ModifierComte(Compte c) throws RemoteException;
		public Compte RechercherParNUNC(INT code) throws RemoteException;
		public ArrayListe<Compte> AfficheParNumC(int cp); 
}
