package headfirst.designpatterns.proxy;

public class ConcreteHello implements Hello {
	@Override
	public void hello() {
		System.out.println("hello!");
	}
}
