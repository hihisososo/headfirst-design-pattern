package headfirst.designpatterns.bowling;

class Ready extends Running {
    @Override
    public State bowl(int falledPin) {

        if (falledPin == 10) {
            return new Strike();
        }
        return new FirstBowl(falledPin);
    }

    @Override
    public String getDesc() {
        return "상태 : 대기";
    }
}