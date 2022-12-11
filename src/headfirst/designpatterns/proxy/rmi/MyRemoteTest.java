package headfirst.designpatterns.proxy.rmi;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class MyRemoteTest {
	public static void main(String[] args) {
		try {
			MyRemote service = new MyRemoteImpl();
			Naming.bind("RemoteHello", service);
		} catch (AlreadyBoundException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
