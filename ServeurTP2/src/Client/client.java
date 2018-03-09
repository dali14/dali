package Client;
import java.rmi.Naming;
import Server.Hello;

public class client {
public static void main (String[] args) {
	Hello obj;
	String message;
	try {
		//obj  de type Hello
		obj=(Hello)Naming.lookup("rmi://localhost:1099/HelloServer");
		//message de type String
		message=obj.sayHello();
		System.out.println(message);
	}catch(Exception e) {
		//TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
