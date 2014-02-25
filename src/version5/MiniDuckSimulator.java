package version5;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		DuckGroup mallard = new MallardDuck();
		mallard.display();
		mallard.performQuack();
		mallard.performFly();
                mallard.setFlyBehavior(new FlyRocketPowered());
                mallard.setQuackBehavior(new Squeak());

		DuckGroup model = new ModelDuck();
		model.display();
		model.performFly();
		model.setFlyBehavior( new FlyRocketPowered() );
		model.performFly();
	}

}
