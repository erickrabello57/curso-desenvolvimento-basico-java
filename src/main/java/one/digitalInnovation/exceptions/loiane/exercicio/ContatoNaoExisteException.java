package one.digitalInnovation.exceptions.loiane.exercicio;

public class ContatoNaoExisteException extends Exception{

    @Override
    public String toString(){
        return "Contato não está na agenda!";
    }
}
