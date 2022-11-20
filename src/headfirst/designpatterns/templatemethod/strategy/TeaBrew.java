package headfirst.designpatterns.templatemethod.strategy;

public class TeaBrew implements BrewStrategy{
    public void brew() {
        System.out.println("찻잎을 우려내는 중");
    }
}
