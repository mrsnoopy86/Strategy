package Cars;

import interfaces.BuyCar;

public class Audi implements BuyCar{

	@Override
	public void getCar() {
		System.out.println("Buy car of Audi");
	}

}
