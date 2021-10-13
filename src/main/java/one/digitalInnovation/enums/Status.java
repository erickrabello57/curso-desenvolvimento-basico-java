package one.digitalInnovation.enums;

public enum Status {
    OPEN(0, "Aberto"),
    CLOSE(1, "Fechado");

    private int codigo;
    private String descricao;

    Status(final int cod, final String texto){
        this.codigo = cod;
        this.descricao = texto;
    }

    public int getCodigo(){
        return codigo;
    }

    public String getDescricao(){
        return descricao;
    }

}
