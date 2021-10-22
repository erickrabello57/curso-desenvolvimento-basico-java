package one.digitalInnovation.exceptions.loiane.exercicio;

public class Contato {
    private String nome = "";
    private String telefone = "";
    private int id;
    public static int cont = -5;

    public Contato(String nomeContato, String telContato){
        this.nome = nomeContato;
        this.telefone = telContato;
        this.id = cont;
        cont++;
    }

    public Contato(){
        this.nome = "";
        this.telefone = "";
        this.id = cont;
        cont++;
    }



    public String getNome(){

        return this.nome;
    }

    public String getTelefone(){

        return this.telefone;
    }

    public int getId(){

        return this.id;
    }

    @Override
    public String toString(){
        return "Contato [Nome: " + this.getNome() + " | " +
                "Telefone: " + this.getTelefone() + " | " +
                "id: " + this.getId() +"]";
    }
}
