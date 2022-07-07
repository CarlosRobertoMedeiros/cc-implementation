package br.com.roberto.ccimplementation;

public class Refrigerante extends Item{

    public Refrigerante(String nome,double preco){
        super("Refrigerante",nome,preco);
    }

    @Override
    public double getImposto() {
        return 10;
    }
}
