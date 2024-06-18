package vehicles;
public class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String brand, String model, int year, double loadCapacity) {
        super(brand, model, year);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void start() {
        System.out.println("Truck is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Truck is stopping.");
    }

	@Override
	public String toString() {
		return "Truck [loadCapacity=" + loadCapacity + ", toString()=" + super.toString() + "]";
	}
    
    
}
