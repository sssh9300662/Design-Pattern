package design.behavioral.strategy;

public class Main {

    public static void main(String args[]) {

        AttackMode attackMode = new GunAttack();
        SpeedDown speedDown = new GassSpeedDown();
        SpeedUp speedUp = new GassSpeedUp();

        Car car = new PorscheCar();
        car.setAttackMode(attackMode);
        car.setSpeedDown(speedDown);
        car.setSpeedUp(speedUp);

        car.speedDown();
        car.speedUp();
        car.attack();
    }

}
