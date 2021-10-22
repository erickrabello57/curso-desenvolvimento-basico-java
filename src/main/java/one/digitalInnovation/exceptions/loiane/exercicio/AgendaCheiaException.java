package one.digitalInnovation.exceptions.loiane.exercicio;

public class AgendaCheiaException extends Exception {

    @Override
    public String toString(){
        return "Não é possível adicionar mais contatos pois a agenda está cheia!";
    }


}
