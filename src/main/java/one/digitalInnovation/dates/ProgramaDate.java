package one.digitalInnovation.dates;

import java.util.Date;
import java.time.*;

public class ProgramaDate {
    public static void main(String[] args) {
        Date data1 = new Date();
        Date data2 = new Date(12345678);
        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data1.after(data2));
        System.out.println(data2.after(data1));

        Instant instant = data1.toInstant();
        Instant instant2 = data2.toInstant();
        System.out.println(instant);
        System.out.println(instant2);

    }
}
