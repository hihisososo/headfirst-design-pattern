package headfirst.designpatterns.templatemethod.strategy;

public class Coffee extends CaffeineBeverage {
    public Coffee(){
        this.brewStrategy = new CoffeeBrew();
        this.condimentStrategy = new CoffeeCondiment();
    }
}
