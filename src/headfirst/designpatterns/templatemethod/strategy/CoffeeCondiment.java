package headfirst.designpatterns.templatemethod.strategy;

public class CoffeeCondiment implements CondimentStrategy {
    public void addCondiment() {
        System.out.println("설탕과 우유를 첨가");
    }
}
