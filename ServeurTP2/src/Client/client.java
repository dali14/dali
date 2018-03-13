package Client;
import java.rmi.Naming;
import java.rmi.RemoteException;

import com.dsi.Metier.CompteMetier;
import Models.Compte;




public class client {
public static void main (String[] args) throws RemoteException {
	
	CompteMetier obj= new CompteMetier();
	
	Compte cp=new Compte(1,"courant",1000);

	obj.AjouterCompte(cp);
	
	String message = null;
	try {
		Naming.lookup("rmi://localhost:1099/gestionbanque");
		System.out.println(message);
	}catch(Exception e) {
		
		e.printStackTrace();
	}
}
}
