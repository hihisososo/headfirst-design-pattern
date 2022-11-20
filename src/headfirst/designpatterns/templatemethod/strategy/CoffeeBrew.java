package headfirst.designpatterns.templatemethod.strategy;

public class CoffeeBrew implements BrewStrategy{
    public void brew() {
        System.out.println("필터로 커피를 우려내는 중");
    }
}
