public class Dishwasher extends HouseholdAppliance {
    private int capacity;
    private int programs;

    private static int count = 0;

    public Dishwasher(String brand, int power, int capacity, int programs) {
        super(brand, power);
        this.capacity = capacity;
        this.programs = programs;
        count++;
    }

    public void setPrograms(int programs) {
        this.programs = programs;
    }

    @Override
    public void turnOn() {
        System.out.println("Dishwasher is turned on");
        setOn(true);
    }

    @Override
    public void turnOff() {
        System.out.println("Dishwasher is turned off");
        setOn(false);
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Dishwasher - " + super.toString() + ", Capacity: " + capacity + " sets, Programs: " + programs;
    }
}
