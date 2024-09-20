public class Refrigerator extends HouseholdAppliance {
    private int capacity;
    private int temperature;

    private static int count = 0;

    public Refrigerator(String brand, int power, int capacity, int temperature) {
        super(brand, power);
        this.capacity = capacity;
        this.temperature = temperature;
        count++;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public void turnOn() {
        System.out.println("Refrigerator is turned on");
        setOn(true);
    }

    @Override
    public void turnOff() {
        System.out.println("Refrigerator is turned off");
        setOn(false);
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Refrigerator - " + super.toString() + ", Capacity: " + capacity + "L, Temperature: " + temperature + "C";
    }
}
