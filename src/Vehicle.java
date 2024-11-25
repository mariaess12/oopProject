import java.time.LocalDate;

abstract class Vehicle {
    private int id;
    private int regNo;
    private String manufacturer;
    private String model;
    private String location;
    private LocalDate regDate;

    public Vehicle(int id, int regNo, String manufacturer, String model, String location, LocalDate regDate) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {

        this.location = location;
    }

    public LocalDate getRegDate() {

        return regDate;
    }

    public void setRegDate(LocalDate regDate) {

        this.regDate = regDate;
    }
    @Override
    public String toString(){
        return String.format("Id: %d Registration Number: %d Manufacturer: %s Model: %s Location: %s Date: %s ",id,regNo,manufacturer,model,location,regDate);
    }


}
