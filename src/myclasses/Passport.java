package myclasses;
import java.time.LocalDate;

public class Passport {
    public String number;
    public LocalDate expiryDate;

    public Passport(String number, LocalDate expiryDate){
        this.number = number;
        this.expiryDate = expiryDate;
    }

}
