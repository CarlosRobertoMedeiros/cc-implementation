package br.com.roberto.ccimplementation;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<Item> itensDoPedido;
    public Pedido(){
        this.itensDoPedido = new ArrayList<>();
    }

    void addItem(Item item){
        this.itensDoPedido.add(item);
    }

    Double getTotal(){
        double totalPedido = 0;
        for (Item item :itensDoPedido){
            totalPedido+=item.getPreco();
        }
        return totalPedido;
    }

    public Double getImpostos() {
        double totalImpostos = 0;
        for (Item item :itensDoPedido){
            totalImpostos+=item.calculaImposto();
        }
        return totalImpostos;
    }
}
