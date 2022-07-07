package br.com.roberto.ccimplementation;

public class Cerveja extends Item{

    public Cerveja(String nome, double preco) {
        super("Cerveja",nome, preco);
    }
    @Override
    public double getImposto() {
        return 15;
    }
}
