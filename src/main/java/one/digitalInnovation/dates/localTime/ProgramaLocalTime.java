package one.digitalInnovation.dates.localTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;


public class ProgramaLocalTime {
    public static void main(String[] args) {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
        LocalTime agora = LocalTime.now();
        System.out.println(agora); // sem especificar nenhum formato -> 08:16:50:991375
        System.out.println(agora.format(dateTimeFormatter)); // 08:16:50
        dateTimeFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        System.out.println(agora.format(dateTimeFormatter)); // 08:17
        dateTimeFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.valueOf("MEDIUM"));
        System.out.println(agora.format(dateTimeFormatter)); // No formato MEDIUM usando valueOf
        dateTimeFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.valueOf("SHORT"));
        System.out.println(agora.format(dateTimeFormatter)); // No formato SHORT usando valueOf
        dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss:SSS");
        System.out.println(agora.format(dateTimeFormatter)); // No padrão que eu quero
        LocalTime maisUmaHora = agora.plusHours(1);
        System.out.println(maisUmaHora.format(dateTimeFormatter));
    }
}
