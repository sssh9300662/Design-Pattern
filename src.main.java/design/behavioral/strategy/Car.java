package design.behavioral.strategy;

public abstract class Car {

    private SpeedDown speedDown;

    private SpeedUp speedUp;

    private AttackMode attackMode;

    protected void speedUp() {
        this.speedUp.speedUp();
    }

    protected void speedDown() {
        this.speedDown.speedDown();
    }

    protected void attack() {
        this.attackMode.attck();
    }

    public SpeedUp getSpeedUp() {
        return speedUp;
    }

    public void setSpeedUp(SpeedUp speedUp) {
        this.speedUp = speedUp;
    }

    public SpeedDown getSpeedDown() {
        return speedDown;
    }

    public void setSpeedDown(SpeedDown speedDown) {
        this.speedDown = speedDown;
    }

    public AttackMode getAttackMode() {
        return attackMode;
    }

    public void setAttackMode(AttackMode attackMode) {
        this.attackMode = attackMode;
    }

}
