package one.digitalInnovation.dates.dateFormat;

import java.text.DateFormat;
import java.util.Date;

public class ProgramaDateFormat {
    public static void main(String[] args) {
        Date agora = new Date();
        String dateString = DateFormat.getInstance().format(agora);
        System.out.println(dateString); // 13/10/2021
        dateString = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(agora);
        System.out.println(dateString); //13 de outubro de 2021 11:44:29

    }
}


