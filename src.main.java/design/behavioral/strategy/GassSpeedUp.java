package design.behavioral.strategy;

public class GassSpeedUp implements SpeedUp {

    @Override
    public void speedUp() {
        System.out.println("Use gas to speed up");
    }

}
