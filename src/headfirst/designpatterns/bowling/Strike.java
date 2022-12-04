package headfirst.designpatterns.bowling;

class Strike extends Finished {
    @Override
    public String getDesc() {
        return "상태 : 스트라이크";
    }
}