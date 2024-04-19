import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;
public class WeekDays {
    public static void main(String[] args)
    {
        //using enums
        LocalDate today = LocalDate.now();
        DayOfWeek dayOfWeek = today.getDayOfWeek();
        String message = switch(dayOfWeek){
            case MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY -> "Work Hard";
            case SATURDAY,SUNDAY -> "Enjoy";
        };

        System.out.println(message);
    }
    ///yield is keyword for switch to return values inside switch
}
