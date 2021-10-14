package one.digitalInnovation.dates.localDateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ProgramaLocalDateTime {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy");
        System.out.println(localDateTime); // sem formato especificado
        System.out.println(localDateTime.format(dateTimeFormatter));// com meu formato
        localDateTime = localDateTime.plusDays(2).plusHours(5).plusMinutes(2).plusSeconds(10).plusYears(3);
        System.out.println(localDateTime.format(dateTimeFormatter));
    }
}
