package headfirst.designpatterns.templatemethod.strategy;


public class Tea extends CaffeineBeverage {
    public Tea() {
        this.brewStrategy = new TeaBrew();
        this.condimentStrategy = new TeaCondiment();
    }
}
