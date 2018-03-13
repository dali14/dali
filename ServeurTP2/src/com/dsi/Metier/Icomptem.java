package com.dsi.Metier;

import java.rmi.RemoteException;
import java.util.ArrayList;

import Models.Compte;

public interface Icomptem{
	
	
		public ArrayList<Compte> AfficherListe();
		public void AjouterCompte (Compte c) throws RemoteException;
		public void ModifierCompte(Compte c) throws RemoteException;
		public void SupprimeCompte(int code) throws RemoteException;
		public Compte RechercherParNUNC(int code) throws RemoteException;
		 // public ArrayListe<Compte> AfficheParNumC(int cp); 
		public void ModifierSoldeCompte(int solde,int compte) throws RemoteException;
	
		
		
		
}
