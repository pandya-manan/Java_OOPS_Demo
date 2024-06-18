package vehicles;
public class Bus extends Vehicle {
    private int seatingCapacity;

    public Bus(String brand, String model, int year, int seatingCapacity) {
        super(brand, model, year);
        this.seatingCapacity = seatingCapacity;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public void start() {
        System.out.println("Bus is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Bus is stopping.");
    }

	@Override
	public String toString() {
		return "Bus [seatingCapacity=" + seatingCapacity + ", toString()=" + super.toString() + "]";
	}
    
    
}

