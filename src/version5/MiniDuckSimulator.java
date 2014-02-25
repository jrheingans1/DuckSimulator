package version5;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        // Ducks that can Quack
        QuackGroup[] ducks = {
            new MallardDuck(new Quack(), new FlyWithWings()),
            new RubberDuck(new Squeak())
        };

        for (QuackGroup duck : ducks) {
            duck.performQuack();
            duck.display();
        }

    }

}
