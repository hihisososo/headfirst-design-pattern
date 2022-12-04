package headfirst.designpatterns.state.gumballstate;

public class SoldState implements State {
 
    GumballMachine gumballMachine;
 
    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
       
	public void insertQuarter() {
		System.out.println("껌을 뽑는중입니다");
	}
 
	public void ejectQuarter() {
		System.out.println("레버를 이미 당겼습니다");
	}
 
	public void turnCrank() {
		System.out.println("레버를 두번 돌릴 수 없습니다");
	}
 
	public void dispense() {
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		} else {
			System.out.println("껌이 다 떨어졌습니다");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}
	
	public void refill() { }
 
	public String toString() {
		return "껌을 분배하는 중";
	}
}


