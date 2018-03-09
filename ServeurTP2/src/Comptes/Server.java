package Comptes;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
public class Server {
public static void main (String[] args) {
	try {
		System.out.println("une autre version");
		LocateRegistry.createRegistry(1099);
		//créer un objet de type RMI
		CompteImp obj=new CompteImp();
		
		//Binding sous le nom "HelloServer"
		Naming.rebind("rmi://localhost:1099/Compte", obj);
		
		System.out.println(obj.toString());
	
	}catch (Exception e) {
		//TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
