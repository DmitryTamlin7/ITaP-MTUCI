public class VacuumCleaner extends HouseholdAppliance {
    private String filterType;
    private boolean isBagFull;

    private static int count = 0;

    public VacuumCleaner(String brand, int power, String filterType) {
        super(brand, power);
        this.filterType = filterType;
        this.isBagFull = false;
        count++;
    }

    public void emptyDustBag() {
        System.out.println("Dust bag is emptied");
        isBagFull = false;
    }

    @Override
    public void turnOn() {
        System.out.println("Vacuum cleaner is turned on");
        setOn(true);
    }

    @Override
    public void turnOff() {
        System.out.println("Vacuum cleaner is turned off");
        setOn(false);
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Vacuum Cleaner - " + super.toString() + ", Filter Type: " + filterType + ", Bag Full: " + isBagFull;
    }
}
