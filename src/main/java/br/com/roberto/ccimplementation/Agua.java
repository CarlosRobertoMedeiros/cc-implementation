package br.com.roberto.ccimplementation;

public class Agua extends Item{

    public Agua(String nome, double preco) {
       super("Agua",nome, preco);
    }

    @Override
    public double getImposto() {
        throw new RuntimeException("A Água é isenta de impostos");
    }
}
