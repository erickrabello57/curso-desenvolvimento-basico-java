package one.digitalInnovation.exceptions;

public class Exemplo1 {
    public static void main(String[] args) {
        metodo();
        System.out.println(soma("3.0", "0.0"));
        System.out.println("=== FIM DO PROOGRAMA ===");
        Pessoa [] vetorPessoas = new Pessoa[10];
        //vetorPessoas[3] = new Pessoa("Erick", 34);
        try{
            System.out.println(vetorPessoas[3].getClass());
        }catch(NullPointerException e){
            System.out.println("Exceção ocorreu");
        }catch(Exception e){
            System.out.println("Exceção ocorreu aqui!");
        }
        System.out.println("=== FIM DO PROOGRAMA ===");

    }

    public static void metodo(){
        try{
            new java.io.FileInputStream("arquivo.txt");
        }catch (java.io.FileNotFoundException e){
            System.out.println("Não foi possível abrir o arquivo para leitura");
        }
    }

    public static double soma(String a, String b) {
        double y = 0;
        double x = 0;
        try {
            x = Double.parseDouble(a);
            y = Double.parseDouble(b);

        } catch (java.lang.NumberFormatException e) {
            System.err.println("Formato de número errado");
        }
        return x + y;
    }
}
