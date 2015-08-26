package Cars;

import interfaces.BuyCar;

public class BMW implements BuyCar{

	@Override
	public void getCar() {
		System.out.println("Buy car of BMW");
	}

}
