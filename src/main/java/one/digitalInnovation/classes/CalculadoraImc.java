package one.digitalInnovation.classes;
import one.digitalInnovation.classes.pessoa.Pessoa;

public class CalculadoraImc {

    public static double calculaImc(Pessoa pessoa){
       double peso = pessoa.getPeso();
       double altura = pessoa.getAltura();

       return peso / (altura * altura);
    }
}
