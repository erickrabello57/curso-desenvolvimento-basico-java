package one.digitalInnovation.exceptions.loiane.aula47;

public class Excecao {
    public static void main(String[] args) {
        try{
            int [] vetor = new int[10];
            System.out.println("Antes da exception");
            vetor[10] = 1;
            System.out.println("Não será impresso");
        }catch(ArrayIndexOutOfBoundsException exception){
            System.out.println("Exceção de índice de vetor que não existe!");
        }
        System.out.println("Texto impresso após a exceção");


    }
}
