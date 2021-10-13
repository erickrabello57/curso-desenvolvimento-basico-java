package one.digitalInnovation.interfaces;

public class Fiesta implements Carro, Veiculo{

    @Override
    public String marca() {
        return "Ford";
    }

    @Override
    public String registro() {
        return "Registro do Fiesta";
    }

    @Override
    public void ligar() {
        Carro.super.ligar();
        Veiculo.super.ligar();
    }
}
