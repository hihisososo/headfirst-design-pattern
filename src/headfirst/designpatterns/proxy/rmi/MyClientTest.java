package headfirst.designpatterns.proxy.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class MyClientTest {
	public static void main(String[] args) throws MalformedURLException, NotBoundException, RemoteException {
		MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
		System.out.println(service.sayHello());
	}
}
