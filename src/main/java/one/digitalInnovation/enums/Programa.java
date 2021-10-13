package one.digitalInnovation.enums;

public class Programa {
    public static void main(String[] args) {
        System.out.println(TipoVeiculo.AQUATICO);
        System.out.println(TipoVeiculo.valueOf("AEREO"));

        for(TipoVeiculo tv : TipoVeiculo.values()){
            System.out.println(tv);
        }

        System.out.println(Status.CLOSE.getCodigo());
        System.out.println(Status.CLOSE.getDescricao());

    }
}

