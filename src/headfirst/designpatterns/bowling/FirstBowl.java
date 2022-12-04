package headfirst.designpatterns.bowling;

class FirstBowl extends Running {
    private final int firstPin;

    FirstBowl(int falledPins) {
        this.firstPin = falledPins;
    }

    @Override
    public State bowl(int falledPins) {

        if (firstPin < 10) {
            return new Spare(firstPin, falledPins);
        }
        return new Miss(firstPin, falledPins);
    }

    @Override
    public String getDesc() {
        return "상태 : 첫 투구, 쓰러진 핀 : " + firstPin;
    }
}