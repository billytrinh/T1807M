package Session9;

import java.time.*;
import java.util.ArrayList;

public class Main {

    public static void main(String args[]){
//        UInterface ui = new UInterface() {
//            @Override
//            public void running() {
//                System.out.println("hahah running..");
//            }
//        };
//        ui.running();

        UInterface ui2 = (int a, int b)->{
            System.out.println("ui 2 running...");
        };

        ui2.running(1,2);

        X x = new X();
        x.a().b().c();

        ArrayList<String> strArr = new ArrayList<>();
        strArr.add("hello");
        strArr.add("abc");
        strArr.add("aaa");
        strArr.add("ccc");
        strArr.add("bbb");

        strArr.stream().filter(s -> s.startsWith("a"))
                .map(s -> {s= s.toUpperCase();return  s;})
                .sorted()
                .forEach(s->System.out.println(s));

        for (String s:strArr){
            System.out.println(s);
        }

    }
    public static void main2(String args[]){

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

        String str = "1901-02-28";
        LocalDate c20 = LocalDate.parse(str);
        LocalDate next_c20 = c20.plusDays(1);
        while (next_c20.getDayOfMonth() != 29){
            c20 = c20.plusYears(1);
            next_c20 = c20.plusDays(1);
        }

        int year = c20.getYear();

        for (int i = year;i<=2000;i+=4){
            System.out.println(i);
        }

    }

}
