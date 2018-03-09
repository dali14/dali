package Server;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
public class server {
public static void main (String[] args) {
	try {
		System.out.println("une autre version");
		LocateRegistry.createRegistry(1099);
		//créer un objet de type RMI
		HelloImp obj=new HelloImp();
		
		//Binding sous le nom "HelloServer"
		Naming.rebind("rmi://localhost:1099/HelloServer", obj);
		
		System.out.println(obj.toString());
	
	}catch (Exception e) {
		//TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
