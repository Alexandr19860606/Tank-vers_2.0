//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // В (0;0) с fuel = 100
        Tank justTank = new Tank();
// В (10;20) с fuel = 100
        Tank anywareTank = new Tank(10, 10);
// В (20;30) с fuel = 200
        Tank customTank = new Tank(20, 30, 200);
        justTank.goForward(2000);
        justTank.printPosition();
        anywareTank.goBackward(-2000);
        anywareTank.printPosition();
        customTank.goForward(2010);
        customTank.printPosition();

    }
}