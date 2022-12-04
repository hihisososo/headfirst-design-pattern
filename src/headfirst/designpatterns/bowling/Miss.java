package headfirst.designpatterns.bowling;

class Miss extends Finished {
    private final int firstPin;
    private final int secondPin;

    Miss(int firstPin, int secondPin) {
        this.firstPin = firstPin;
        this.secondPin = secondPin;
    }

    @Override
    public String getDesc() {
        return "상태 : 미스, 첫째 핀 : " + firstPin + ", 둘째 핀 : " + secondPin;
    }
}