package com.dsi.Metier;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.sql.*;

import Models.Compte;



public class CompteMetier extends UnicastRemoteObject implements Icomptem {
	private Connection con=null;
	private PreparedStatement st=null;
	
	


	public CompteMetier() throws RemoteException {
		super();
		setCon(SingletonConnection.getConnection());
	}

	
	
	
	@Override
	public ArrayList<Compte> AfficherListe() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void AjouterCompte(Compte c) throws RemoteException {
		
		
		
		try {
			 st = con.prepareStatement("insert into comptes(NumCp,TypeCp,Solde) values (?,?,?);");
			
			st.setInt(1,c.getNumCp());
			st.setString(2,c.getTypeCp());
			st.setInt(3,c.getSolde());
			st.executeUpdate();
			
		}catch (SQLException ex) {
			
		}
		
		
	}

	@Override
	public void ModifierCompte(Compte c) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SupprimeCompte(int code) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Compte RechercherParNUNC(int code) throws RemoteException {
		Compte c=null;
		try {
			st=con.prepareStatement("select * from comptes where NumCp=?");
			st.setInt(1, code);
			ResultSet rs = st.executeQuery();
			if (rs.next())
			{
				c=new Compte();
				c.setNumCp(rs.getInt("NumCp"));
				c.setTypeCp(rs.getString("TypeCp"));
				c.setSolde(rs.getInt("Solde"));
			}
			
			
		}catch (SQLException ex) {
			
		}
		return c;
	}

	@Override
	public void ModifierSoldeCompte(int solde, int compte) throws RemoteException {
		// TODO Auto-generated method stub
		
	}




	public Connection getCon() {
		return con;
	}




	public void setCon(Connection con) {
		this.con = con;
	}

}
