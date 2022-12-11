package headfirst.designpatterns.proxy;

public class HelloTest {
	public static void main(String[] args) {
		Hello hello = new ConcreteHello();
		Hello proxyHello = new ProxyHello(hello);

		proxyHello.hello();
	}
}
