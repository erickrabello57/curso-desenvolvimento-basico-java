package one.digitalInnovation.exceptions.loiane.aula48;

public class MultiplosCatchGenerico {
    public static void main(String[] args) {
        int [] numeros = {4, 8, 16, 32, 64, 128};
        int [] denominador = {2, 0, 4, 8, 0};

        for(int i = 0; i < numeros.length; i++){
            try{
                System.out.println( numeros[i] + " / " + denominador[i] + " = " + numeros[i] / denominador[i] );
            }
            catch(ArithmeticException e1){
                System.out.println("Erro ao dividir por zero!");
            }
            catch (Throwable e){
                System.out.println("Ocorreu um erro!");
            }
        }
        // Mutliplos catch de exceptions similares (Java 7 ou acima)

        for(int i = 0; i < numeros.length; i++){
            try{
                System.out.println( numeros[i] + " / " + denominador[i] + " = " + numeros[i] / denominador[i] );
            }
            catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
                System.out.println("Erro ao dividir por zero!");
            }
        }

    }
}
