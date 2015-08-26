package utils;

import Cars.Audi;
import interfaces.BuyCar;

public abstract class Cars {
	protected BuyCar buyCar;
	
	public Cars(){
		this.buyCar = new Audi();
	}
	
	public void getCar(){
		buyCar.getCar();
	}
	
	public void setCarForBuing(BuyCar buyCar){
		this.buyCar = buyCar;
	}
}
