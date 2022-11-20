package headfirst.designpatterns.templatemethod.strategy;

public class CaffeineBeverage {
    protected BrewStrategy brewStrategy;
    protected CondimentStrategy condimentStrategy;

    final void prepareRecipe() {
        boilWater();
        brewStrategy.brew();
        pourInCup();
        condimentStrategy.addCondiment();
    }

    void boilWater() {
        System.out.println("물을 끓이는 중");
    }

    void pourInCup() {
        System.out.println("컵에 따르는 중");
    }
}
