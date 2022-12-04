package headfirst.designpatterns.bowling;

public interface State {
    State bowl(int falledPins);

    boolean isFinish();

    String getDesc();
}