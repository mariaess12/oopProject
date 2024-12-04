import java.time.LocalDate;
import java.time.LocalTime;

public class Booking {
    private int bookingId;
    private int vehicleId;
    private int custNo;
    private LocalDate pickUpDate;
    private LocalTime pickUpTime;
    private LocalDate returnDate;
    private LocalTime returnTime;
    private String pickUpLocation;

    public Booking(int bookingId, int vehicleId, int custNo,LocalDate pickUpDate,LocalTime pickUpTime, LocalDate returnDate, LocalTime returnTime,String pickUpLocation) {
        this.bookingId = bookingId;
        this.vehicleId = vehicleId;
        this.custNo = custNo;
        this.pickUpDate = pickUpDate;
        this.pickUpTime = pickUpTime;
        this.returnDate = returnDate;
        this.returnTime = returnTime;
        this.pickUpLocation = pickUpLocation;

    }


    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public int getCustNo() {
        return custNo;
    }

    public void setCustNo(int custNo) {
        this.custNo = custNo;
    }

    public LocalDate getPickUpDate() {
        return pickUpDate;
    }

    public void setPickUpDate(LocalDate pickUpDate) {
        this.pickUpDate = pickUpDate;
    }

    public LocalTime getPickUpTime() {
        return pickUpTime;
    }

    public void setPickUpTime(LocalTime pickUpTime) {
        this.pickUpTime = pickUpTime;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public LocalTime getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(LocalTime returnTime) {
        this.returnTime = returnTime;
    }

    public String getPickUpLocation() {
        return pickUpLocation;
    }

    public void setPickUpLocation(String pickUpLocation) {
        this.pickUpLocation = pickUpLocation;
    }
    @Override
    public String toString() {
        return String.format("Booking id: %d Vehicle: %d Customer Id: %d Pick Up Date: %s Pick up Time: %s Return Date: %s Return Time: %s Pick up Location: %s ", bookingId, vehicleId, custNo,pickUpDate,pickUpTime,returnDate,returnTime,pickUpLocation);

    }
}
