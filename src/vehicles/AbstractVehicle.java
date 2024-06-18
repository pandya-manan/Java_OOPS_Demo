package vehicles;
interface VehicleOperations {
    void start();
    void stop();
}

public abstract class AbstractVehicle implements VehicleOperations {
    private String brand;
    private String model;
    private int year;

    public AbstractVehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Getter and Setter methods
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Abstract methods
    @Override
    public abstract void start();

    @Override
    public abstract void stop();
}
