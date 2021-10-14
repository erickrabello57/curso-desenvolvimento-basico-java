package one.digitalInnovation.dates.localDate;

import java.time.LocalDate;

public class ProgramaLocalDate {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje); // 2021-10-13
        LocalDate ontem = hoje.minusDays(1);
        System.out.println(ontem); // 2021-10-12
    }
}
