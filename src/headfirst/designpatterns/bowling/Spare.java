package headfirst.designpatterns.bowling;

class Spare extends Finished {
    private final int firstPins;
    private final int secondPins;

    Spare(int firstPins, int secondPins) {
        if (firstPins >= 10) {
            throw new IllegalArgumentException();
        }

        this.firstPins = firstPins;
        this.secondPins = secondPins;
    }

    @Override
    public String getDesc() {
        return "상태 : 스페어, 첫째 핀 : " + firstPins + " 둘째 핀 : " + secondPins;
    }
}