package one.digitalInnovation.dates.simpleDateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProgramaSimpleDateFormat {
    public static void main(String[] args) {
        Date agora = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
        String dataFormatada = formatter.format(agora);
        System.out.println(dataFormatada); // 13/10/21
        formatter = new SimpleDateFormat("dd/MM/yyyy");
        dataFormatada = formatter.format(agora);
        System.out.println(dataFormatada); // 13/10/2021
    }
}
