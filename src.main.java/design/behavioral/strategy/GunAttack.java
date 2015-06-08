package design.behavioral.strategy;

public class GunAttack implements AttackMode {

    @Override
    public void attck() {
        System.out.println("Bang!Bang!");
    }

}
