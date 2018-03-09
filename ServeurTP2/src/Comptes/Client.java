package Comptes;
import java.rmi.Naming;
import Comptes.CompteImp;
public class Client {
	public static void main (String[] args) {
		ICompte obj;
		double m=100;
	try {
		obj=(CompteImp)Naming.lookup("rmi://localhost:1099/Compte");
			obj.Crediter(12);
			System.out.println("montant credité");
		obj.Debiter(12);
		System.out.println("montant debité");
		double res;
		res=obj.lire_solde();
		System.out.println(res);
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
	}
