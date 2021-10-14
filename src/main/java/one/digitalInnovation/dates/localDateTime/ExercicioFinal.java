package one.digitalInnovation.dates.localDateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExercicioFinal {
    //Adicione 4 anos, 6 meses e 13 horas ao momento 15/05/2010 10:00:00

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2010, 5, 15, 10, 0, 0);
        System.out.println(localDateTime);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println(localDateTime.format(dateTimeFormatter));
        LocalDateTime future = localDateTime.plusYears(4).plusMonths(6).plusHours(13);
        System.out.println(future.format(dateTimeFormatter));
    }
}
