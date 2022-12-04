package headfirst.designpatterns.bowling;

abstract class Running implements State {
    @Override
    public boolean isFinish() {
        return false;
    }

}