package Models;

import java.io.Serializable;

public class Compte implements Serializable {
	
	private int numCp ;
	private String typeCp ;
	private int solde ;
	public Compte(int numCp, String typeCp, int solde) {
		super();
		this.numCp = numCp;
		this.typeCp = typeCp;
		this.solde = solde;
	}
	@Override
	public String toString() {
		return "Compte [numCp=" + numCp + ", typeCp=" + typeCp + ", solde=" + solde + "]";
	}
	public int getNumCp() {
		return numCp;
	}
	public void setNumCp(int numCp) {
		this.numCp = numCp;
	}
	public String getTypeCp() {
		return typeCp;
	}
	public void setTypeCp(String typeCp) {
		this.typeCp = typeCp;
	}
	public int getSolde() {
		return solde;
	}
	public void setSolde(int solde) {
		this.solde = solde;
	}
	
	public Compte() {};
	

}
