package one.digitalInnovation.dates;
import java.util.Date;
import java.time.Instant;

public class Exercicio1 {

    public static void main(String[] args) {
        Date data = new Date(10, 5, 15);
        Date nascimento = new Date( 87, 5, 30);
        long horaAtual = System.currentTimeMillis();
        System.out.println(horaAtual);
        System.out.println(nascimento);
        long nascimentoLong = nascimento.getTime();
        //System.out.println(nascimentoLong); 552020400000
        Date dataTeste = new Date(nascimentoLong);
        //System.out.println(dataTeste); Tue Jun 30 00:00:00 BRT 1987


    }
}
