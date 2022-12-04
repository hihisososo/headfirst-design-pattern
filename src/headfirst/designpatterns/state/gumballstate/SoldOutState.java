package headfirst.designpatterns.state.gumballstate;

public class SoldOutState implements State {
    GumballMachine gumballMachine;
 
    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertQuarter() {
		System.out.println("동전을 넣을 수 없습니다. 껌이 다 팔렸습니다");
	}
 
	public void ejectQuarter() {
		System.out.println("동전을 넣지 않아 뽑을 수 없습니다");
	}
 
	public void turnCrank() {
		System.out.println("껌이 다 팔렸습니다");
	}
 
	public void dispense() {
		System.out.println("껌이 없습니다");
	}
	
	public void refill() { 
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}
 
	public String toString() {
		return "다 팔림";
	}
}
