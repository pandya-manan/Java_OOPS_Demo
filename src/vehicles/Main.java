package vehicles;
public class Main {
    public static void main(String[] args) {
        Vehicle auto = new Auto("Bajaj", "RE", 2019, 3);
        Vehicle bus = new Bus("Volvo", "9700", 2020, 50);
        Vehicle car = new Car("Toyota", "Camry", 2021, "Petrol");
        Vehicle truck = new Truck("Ford", "F-150", 2022, 10.5);

        auto.start();
        bus.start();
        car.start();
        truck.start();

        System.out.println(auto.toString());
        System.out.println(bus.toString());
        System.out.println(car.toString());
        System.out.println(truck.toString());
        
        auto.stop();
        bus.stop();
        car.stop();
        truck.stop();
    }
}
