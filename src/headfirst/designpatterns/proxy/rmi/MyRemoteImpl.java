package headfirst.designpatterns.proxy.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
	private static final long serialVersionUID = 1L;

	protected MyRemoteImpl() throws RemoteException {
	}

	@Override
	public String sayHello() throws RemoteException {
		return "hello";
	}
}
