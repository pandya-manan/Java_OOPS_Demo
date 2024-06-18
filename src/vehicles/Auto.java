package vehicles;
public class Auto extends Vehicle {
    private int numOfWheels;

    public Auto(String brand, String model, int year, int numOfWheels) {
        super(brand, model, year);
        this.numOfWheels = numOfWheels;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    @Override
    public void start() {
        System.out.println("Auto is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Auto is stopping.");
    }

	@Override
	public String toString() {
		return "Auto [numOfWheels=" + numOfWheels + ", toString()=" + super.toString() + "]";
	}
    
    
}
