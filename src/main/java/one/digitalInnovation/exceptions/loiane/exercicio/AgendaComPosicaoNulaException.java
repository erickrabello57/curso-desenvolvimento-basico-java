package one.digitalInnovation.exceptions.loiane.exercicio;

public class AgendaComPosicaoNulaException extends Exception{

    @Override
    public String toString(){
        return "Agenda possui posições nulas!";
    }
}
