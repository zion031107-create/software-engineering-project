package main;

public class CombustionCar extends Car {
	
	public CombustionCar(String carNumber, double weight, double height) {
		super(carNumber, weight, height);
	}
	
	@Override
	public boolean isElectric() {
		return false;
	}
	
}
