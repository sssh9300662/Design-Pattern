package design.behavioral.strategy;

public class GassSpeedDown implements SpeedDown {

    @Override
    public void speedDown() {
        System.out.println("Use gas to speed down");
    }

}
