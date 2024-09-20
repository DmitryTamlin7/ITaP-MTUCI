public abstract class HouseholdAppliance {
    private String brand;
    private int power;
    private boolean isOn;

    public HouseholdAppliance(String brand, int power) {
        this.brand = brand;
        this.power = power;
        this.isOn = false;
    }

    public abstract void turnOn();

    public abstract void turnOff();

    // геттеры и сеттеры
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public boolean getisOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Power: " + power + "W, Is on: " + isOn;
    }
}
