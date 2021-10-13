package one.digitalInnovation.string;

public class StringMain {
    public static void main(String[] args) {
        var nome = "Erick";
        var sobrenome = "Rabello";
        final var nomeCompleto = nome + sobrenome;

        final var mensagem = String.format("O cliente se chama %s !", nomeCompleto);
        System.out.println(mensagem);

        final var builder = new StringBuilder(nome);
        builder.append(sobrenome);
        System.out.println(builder);
    }

}
