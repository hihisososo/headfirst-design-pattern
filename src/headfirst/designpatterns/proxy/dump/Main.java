package headfirst.designpatterns.proxy.dump;

import java.lang.reflect.Proxy;

public class Main {
	public static void main(String[] args) {
		System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
		ClassLoader classLoader = ClassLoader.getSystemClassLoader();
		Class<?>[] interfaces = {BasicOperation.class, AdvancedOperation.class};
		Class<?> proxyClass = Proxy.getProxyClass(classLoader, interfaces);
	}
}
