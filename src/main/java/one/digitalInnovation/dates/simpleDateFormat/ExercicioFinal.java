package one.digitalInnovation.dates.simpleDateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

/*Converta a data atual no formato DD/MM/YYYY HH:MM:SS:MMM*/

public class ExercicioFinal {
    public static void main(String[] args) {
        SimpleDateFormat meuFormato = new SimpleDateFormat("dd/MM/yyy HH:mm:ss:SSS");
        Date dataAtual = new Date();
        System.out.println(dataAtual);
        String dataFormatada = meuFormato.format(dataAtual);
        System.out.println(dataFormatada);
    }
}
