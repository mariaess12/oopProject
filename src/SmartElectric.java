import java.time.LocalDate;

public class SmartElectric extends Vehicle{
    public SmartElectric(int id, int regNo, String manufacturer, String model, String location, LocalDate regDate) {
        super(id, regNo, manufacturer, model, location, regDate);
    }
    private double battery;
    private int range;
    private int efficiency;

    public double getBattery() {
        return battery;
    }

    public void setBattery(double battery) {
        this.battery = battery;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(int efficiency) {
        this.efficiency = efficiency;
    }
    @Override
    public String toString(){
        return String.format("Battery: %s Range: %d Efficiency: %s", battery, range ,efficiency);
    }
}
