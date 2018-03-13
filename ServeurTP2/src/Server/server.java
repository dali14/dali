package Server;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.sql.*;

import com.dsi.Metier.CompteMetier;
public class server {
public static void main (String[] args) {
	try {
		
		LocateRegistry.createRegistry(1099);
		//créer un objet de type RMI
		CompteMetier obj=new CompteMetier();
		
		//Binding sous le nom "HelloServer"
		Naming.rebind("rmi://localhost:1099/gestionbanque", obj);
		
		System.out.println(obj.toString());
	
	}catch (Exception e) {
		//TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
