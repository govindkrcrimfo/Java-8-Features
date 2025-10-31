package dateAndTimeApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/*
 * Date and Time Api
 */
public class DateAndTime {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Local Date : " + localDate);
        System.out.println("Local Time : " + localTime);
        System.out.println("Local Date and Time : " + localDateTime);
    }
}
