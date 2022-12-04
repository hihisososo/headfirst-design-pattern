package headfirst.designpatterns.bowling;

public class BowlingTest {
    public static void main(String[] args) {
        State state = new Ready();

        state = state.bowl(5);
        System.out.println(state.getDesc());
        System.out.println(state.isFinish());

        state = state.bowl(5);
        System.out.println(state.getDesc());
        System.out.println(state.isFinish());

        state = new Ready();
        state = state.bowl(10);
        System.out.println(state.getDesc());
        System.out.println(state.isFinish());
    }
}
