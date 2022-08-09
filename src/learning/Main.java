package learning;

import java.time.LocalDateTime;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
    }
}
