package br.com.roberto.ccimplementation;

public abstract class Item {

    private String categoria;
    private String nome;
    private Double preco;

    public Item(String categoria, String nome, Double preco){
        this.categoria = categoria;
        this.nome = nome;
        this.preco = preco;
    }

    public Double getPreco() {
        return preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public Double calculaImposto(){
        return this.preco * this.getImposto();
    }

    //Implementando um Template Method
    public abstract double getImposto();
}
