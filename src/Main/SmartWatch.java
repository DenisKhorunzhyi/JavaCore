package Main;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class SmartWatch {
    DateTimeFormatter  format = DateTimeFormatter.ofPattern("HH:mm:ss");
    private LocalTime time;
    private double prise;
    private String productName;
    SmartWatch(String productName,double prise){
        this.time = LocalTime.now();
        this.productName = productName;
        this.prise = prise;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public double getPrise() {
        return prise;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }

    @Override
    public String toString() {
        return "SmartWatch information:\n"+"Brand: "+productName+ "\nCost "+prise+"\nCurrent Time "+time
                ;
    }
}
