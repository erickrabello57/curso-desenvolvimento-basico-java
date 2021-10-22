package one.digitalInnovation.exceptions.loiane.exercicio;

import java.util.Scanner;

public class Agenda {
    private final Contato [] contatos = new Contato[5];
    private boolean cheia;

    public Agenda(){
        for(int i = 0; i < this.contatos.length; i++){
            contatos[i] = new Contato();
        }
    }
    public Contato[] getContatos(){
        return this.contatos;
    }

    public boolean isCheia() {

        return cheia;
    }

    public void setCheia(boolean cheia) {

        this.cheia = cheia;
    }

    public void adicionarContato(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o nome do contato para adicioná-lo na agenda: ");
        String nome = scan.next();
        System.out.println("Entre com o telefone do contato para adicioná-lo na agenda: ");
        String telefone = scan.next();
        Contato contato = new Contato(nome, telefone);

        try{
            if(verificaAgendaCheia()){
                this.setCheia(true);
                throw new AgendaCheiaException();
            }
        }catch(AgendaCheiaException e){
            e.printStackTrace();
        }

        for (int i = 0; i < contatos.length;  i++) {
            if(contatos[i].getId() < 0){
                contatos[i] = contato;
                break;
            }
        }
    }

    public boolean verificaAgendaCheia(Agenda this){
        this.setCheia(true);

        for (Contato c: this.contatos) {
            if (c.getId() < 0) {
                this.setCheia(false);
                break;
            }
        }
        return this.isCheia();
    }

    public void consultarContato(){

        System.out.println("Entre com o nome do contato que deseja consultar: ");
        Scanner scan = new Scanner(System.in);
        String nome = scan.next();
        Contato contato = new Contato(nome, "");


        for (Contato c : this.contatos) {
            try{
                if(c.getNome().equals(contato.getNome())){
                    System.out.println(c);
                    break;
                }else{
                    throw new ContatoNaoExisteException();
                }
            }catch (ContatoNaoExisteException e){
                e.printStackTrace();
                break;
            }
        }

    }

    public void listarContatos(Agenda this){
        for (Contato c: contatos) {
            if(c.getId() < 0 ){
                System.out.println("LUGAR VAZIO");
            }else{
                System.out.println(c);
            }

        }
    }

    //método voltado para testar sem uso do terminal
    public void adicionarContato(Contato contato){
        try{
            if(verificaAgendaCheia()){
                this.setCheia(true);
                throw new AgendaCheiaException();
            }
        }catch(AgendaCheiaException e){
            e.printStackTrace();
        }

        for (int i = 0; i < contatos.length;  i++) {
            if(contatos[i].getId() < 0){
                contatos[i] = contato;
                break;
            }
        }
    }

}
