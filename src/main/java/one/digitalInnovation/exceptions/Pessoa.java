package one.digitalInnovation.exceptions;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String name){
        this.nome = name;
        this.idade = -1;
    }

    public Pessoa(String name, int age){
        this.nome = name;
        this.idade = age;
    }

    public int getIdade() {
        return idade;
    }
}
