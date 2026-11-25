package main;

public abstract class Car extends Vehicle{
	private static final double COMPACT_WEIGHT = 1000.0;
    private static final double COMPACT_HEIGHT = 2.0;
    
	public Car(String carNumber, double weight, double height) {
		super(carNumber, weight, height);
	}
	
	public boolean inCompact() {
		return getWeight() <= COMPACT_WEIGHT
				&& getHeight() <= COMPACT_HEIGHT;
	}
	
	public abstract boolean isElectric();
	
}
