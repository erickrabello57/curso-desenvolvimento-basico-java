package one.digitalInnovation.exceptions.loiane.aula51;

public class SimulandoError {
    public static void main(String[] args) {
        int [] vetorNumeros = new int[1000000000];
        int y = 0;

        for(int i = 0; i < vetorNumeros.length; i++){
            vetorNumeros[i] = y++;
            System.out.println(vetorNumeros[i]);
        }
    }
}
