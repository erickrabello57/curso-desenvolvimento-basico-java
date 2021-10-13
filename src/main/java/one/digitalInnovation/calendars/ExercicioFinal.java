package one.digitalInnovation.calendars;

import java.util.Calendar;
import java.util.*;

public class ExercicioFinal {
    public static void main(String[] args) {

        /*Um cliente tem 10 dias para pagar uma fatura após sua data de vencimento sem que os
        juros sem cobrados. Caso essa data caia em um sábado ou domingo, o cliente pode pagar
        na segunda-feira seguinte. Crie uma estrutura que receba uma data de vencimento e
        calcule quantos dias ele tem para pagar.*/


        Calendar dataVencimento = Calendar.getInstance();
        //dataVencimento.add(Calendar.DATE, 2); //ajuste de data para dataVencimento cair em sab ou dom
        System.out.println(dataVencimento.getTime());
        System.out.println(retornaDataLimite(dataVencimento).getTime());

    }

    public static Calendar retornaDataLimite(Calendar calendar){
        calendar.add(Calendar.DATE, 10);
        if(calendar.get(Calendar.DAY_OF_WEEK) == 7){
            calendar.add(Calendar.DATE, 2);
            return calendar;
        }
        if(calendar.get(Calendar.DAY_OF_WEEK) == 1){
            calendar.add(Calendar.DATE, 1);
            return calendar;
        }
        return calendar;
    }
}
