package headfirst.designpatterns.state.gumballstate;

//import java.util.Random;

public class HasQuarterState implements State {
	GumballMachine gumballMachine;
 
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
  
	public void insertQuarter() {
		System.out.println("동전을 두개 이상 넣을 수 없습니다");
	}
 
	public void ejectQuarter() {
		System.out.println("동전이 반환되었습니다");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}
 
	public void turnCrank() {
		System.out.println("레버를 당겼습니다...");
		gumballMachine.setState(gumballMachine.getSoldState());
	}

    public void dispense() {
        System.out.println("더이상 껌이 없습니다");
    }
    
    public void refill() { }
 
	public String toString() {
		return "레버를 당기길 기다리는 중";
	}
}
