package one.digitalInnovation.classes;
import one.digitalInnovation.classes.pessoa.Pessoa;

public class Programa {
    public static void main(String[] args) {

        final var pessoa = new Pessoa("Erick", 93, 1.75);
        System.out.printf("O IMC de " + pessoa.getNome() + " é : %.2f ", CalculadoraImc.calculaImc(pessoa));
    }
}
