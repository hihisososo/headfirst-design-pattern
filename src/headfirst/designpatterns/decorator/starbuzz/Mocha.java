package headfirst.designpatterns.decorator.starbuzz;

public class Mocha extends CondimentDecorator {
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", 모카";
	}
 
	public double cost() {
		return .20 + beverage.cost();
	}
}
