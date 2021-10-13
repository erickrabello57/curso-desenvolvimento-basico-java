package one.digitalInnovation.calendars;

import java.util.Calendar;

public class CalendarMain {
    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance();
        System.out.println(agora.getTime());
        agora.add(Calendar.DATE, -15);
        System.out.println(agora.getTime());
        agora.add(Calendar.MONTH, 4);
        System.out.println(agora.getTime());
        agora.add(Calendar.YEAR, 2);
        System.out.println(agora);

        //imprimindo datas e horas
        System.out.println("Imprimindo datas e horas");
        System.out.printf("%tc", agora); //CALENDAR
        System.out.println();
        System.out.printf("%tF", agora); //FIELDS?
        System.out.println();
        System.out.printf("%tD", agora); //DATE
        System.out.printf("%tr", agora); //REGION
        System.out.println();
        System.out.printf("%tT", agora); //TIME
    }
}
