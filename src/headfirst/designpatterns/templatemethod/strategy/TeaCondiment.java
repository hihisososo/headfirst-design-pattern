package headfirst.designpatterns.templatemethod.strategy;

public class TeaCondiment implements CondimentStrategy {
    public void addCondiment() {
        System.out.println("레몬을 추가");
    }
}
