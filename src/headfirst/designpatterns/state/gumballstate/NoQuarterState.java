package headfirst.designpatterns.state.gumballstate;

public class NoQuarterState implements State {
    GumballMachine gumballMachine;
 
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertQuarter() {
		System.out.println("동전을 넣으셨습니다");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	public void ejectQuarter() {
		System.out.println("동전을 넣지 않아 반환받을 수 없습니다");
	}

	public void turnCrank() {
		System.out.println("동전을 넣지 않아 레버를 당길 수 없습니다 ");
	 }
 
	public void dispense() {
		System.out.println("동전을 먼저 넣으세요");
	} 
	
	public void refill() { }
 
	public String toString() {
		return "동전을 넣기 기다리는 중";
	}
}
