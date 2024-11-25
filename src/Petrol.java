import java.time.LocalDate;

abstract public class Petrol extends Vehicle {
    // This call is a child class from Vehicle
    public Petrol(int id, int regNo, String manufacturer, String model, String location, LocalDate regDate) {
        super(id, regNo, manufacturer, model, location, regDate);
    }
    private double engine;
    private int co2;

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public int getCo2() {
        return co2;
    }

    public void setCo2(int co2) {
        this.co2 = co2;
    }
    @Override
    public String toString(){
        return String.format("Engine: %s CO2: %d", engine ,co2);
    }
}
