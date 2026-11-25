package main;

public abstract class Vehicle {
	
	private String carNumber;
	private double weight;
	private double height;
	//시간 자동으로할지 입력으로 받을지 결정 
	private int entryTime;
	private int exitTime;
	
	public Vehicle(String carNumber, double weight, double height) {
		this.carNumber = carNumber;
		this.weight = weight;
		this.height = height;	
	}
	
	public String getCarNumber() {
		return carNumber;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public double getHeight() {
		return height;
	}
	
	public int getEntryTime() {
        return entryTime;
    }

    public int getExitTime() {
        return exitTime;
    }

    public void setEntryTime(int entryTime) {
        this.entryTime = entryTime;
    }

    public void setExitTime(int exitTime) {
        this.exitTime = exitTime;
    }
	
    public int getParkingTime() {
        return exitTime - entryTime;
    }
}
