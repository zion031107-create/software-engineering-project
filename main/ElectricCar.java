package main;

public class ElectricCar extends Car {
	public ElectricCar(String carNumber, double weight, double height) {
		super(carNumber, weight, height);
	}
	
	@Override
	public boolean isElectric() {
		return true;
	}
}
