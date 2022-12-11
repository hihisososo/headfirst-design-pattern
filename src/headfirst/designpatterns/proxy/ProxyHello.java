package headfirst.designpatterns.proxy;

public class ProxyHello implements Hello{
	private Hello real;

	public ProxyHello(Hello real) {
		this.real = real;
	}

	@Override
	public void hello() {
		System.out.println("proxy hello");
		real.hello();
	}
}
