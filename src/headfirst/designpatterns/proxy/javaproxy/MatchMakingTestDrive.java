package headfirst.designpatterns.proxy.javaproxy;

import java.lang.reflect.Proxy;
import java.util.HashMap;

public class MatchMakingTestDrive {
	HashMap<String, Person> datingDB = new HashMap<String, Person>();

	public static void main(String[] args) {
		System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
		MatchMakingTestDrive test = new MatchMakingTestDrive();
		test.drive();
	}

	public void drive() {
		Person joe = getPersonFromDatabase("김자바");
		Person ownerProxy = (Person) Proxy.newProxyInstance(joe.getClass().getClassLoader(), joe.getClass().getInterfaces(), new OwnerInvocationHandler(joe));
		System.out.println("이름 " + ownerProxy.getName());
		ownerProxy.setInterests("볼링, 바둑");
		System.out.println("본인 프록시에 관심 사항을 등록합니다");
		try {
			ownerProxy.setGeekRating(10);
		} catch (Exception e) {
			System.out.println("본인 프록시에는 괴짜 지수를 매길 수 없습니다");
		}
		System.out.println("관심사 :" + ownerProxy.getInterests());
		System.out.println("괴짜 지수 " + ownerProxy.getGeekRating());

	}

	public MatchMakingTestDrive() {
		initializeDatabase();
	}

	Person getOwnerProxy(Person person) {

		return (Person) Proxy.newProxyInstance(
				person.getClass().getClassLoader(),
				person.getClass().getInterfaces(),
				new OwnerInvocationHandler(person));
	}

	Person getPersonFromDatabase(String name) {
		return (Person) datingDB.get(name);
	}

	void initializeDatabase() {
		Person joe = new PersonImpl();
		joe.setName("김자바");
		joe.setInterests("자동차, 컴퓨터, 음악");
		joe.setGeekRating(7);
		datingDB.put(joe.getName(), joe);
	}
}
