package Session9;

import java.time.*;

public class Main {

    public static void main(String args[]){

        LocalDate date1 = LocalDate.now();

        System.out.println("Today: "+date1);
        System.out.println("Next day: "+date1.plusDays(1));
        System.out.println("Last day: "+date1.minusDays(1));

        System.out.println("Day: "+date1.getDayOfWeek());
        System.out.println("Day: "+date1.getDayOfMonth());
        System.out.println("Day: "+date1.getDayOfYear());
        System.out.println("Year: "+date1.getYear());

        LocalDate date2 = LocalDate.of(1999,2,28);
        System.out.println("Today: "+date2);
        System.out.println("Next day: "+date2.plusDays(1));
        System.out.println("Last day: "+date2.minusDays(1));

        LocalDate date3 = LocalDate.parse("1999-02-28");
        System.out.println("Today: "+date3);
        System.out.println("Next day: "+date3.plusDays(1));
        System.out.println("Last day: "+date3.minusDays(1));

        LocalDateTime time1 = LocalDateTime.now();
        System.out.println(time1);
        LocalDateTime time2 = LocalDateTime.of(1999,2,28,
                12,20,10,2);
        LocalDateTime time3 = LocalDateTime.parse("1999-02-28T12:20:22.222");
        System.out.println(time3);

        ZonedDateTime zoned = ZonedDateTime.now();
        System.out.println(zoned);
    }

}
