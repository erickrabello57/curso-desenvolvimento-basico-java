package one.digitalInnovation.interfaces;

public interface Carro extends Automovel  {

    String marca();

    default void ligar(){
        System.out.println("Ligando carro!");
    }

    default String renavam(){
        return "RENAVAM";
    }

}
