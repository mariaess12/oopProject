import java.time.LocalDate;

public class SmartVan extends Petrol {
    public SmartVan(int id, int regNo, String manufacturer, String model, String location, LocalDate regDate) {
        super(id, regNo, manufacturer, model, location, regDate);
    }
}
