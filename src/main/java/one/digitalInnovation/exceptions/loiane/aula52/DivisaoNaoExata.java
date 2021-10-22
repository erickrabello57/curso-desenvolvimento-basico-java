package one.digitalInnovation.exceptions.loiane.aula52;

public class DivisaoNaoExata extends Exception{
    private int num;
    private int denominador;

    public DivisaoNaoExata(int numero, int denom){
        super();
        this.num = numero;
        this.denominador = denom;
    }

    @Override
    public String toString(){
        return "Resultado de " + num + " / " + denominador + " não é um inteiro!" ;
    }



}
