package run;

import Buyers.Petya;
import Cars.Audi;
import utils.Cars;

public class Main {
	public static void main(String[] args) {
		Cars buyer = new Petya();
		buyer.getCar();
		buyer.setCarForBuing(new Audi());
		buyer.getCar();
	}
}
