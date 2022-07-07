package br.com.roberto.ccimplementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PedidoTest {

    //Esses Caras estão em nível de entidades
    @Test
    public void deveCriarUmPedidoeCalcularTotal(){
        //Dado que (Given)
        Pedido pedido = new Pedido();
        pedido.addItem(new Refrigerante("Coca-Cola",8.00));
        pedido.addItem(new Cerveja("Brahma",12.00));
        pedido.addItem(new Agua("Crystal",2.00));
        //Quando (When)
        Double total = pedido.getTotal();
        //Então (Then)
        Assertions.assertEquals(total,22);
    }

    @Test
    public void deveCriarUmPedidoeCalcularImpostos(){
        //Dado que (Given)
        Pedido pedido = new Pedido();
        pedido.addItem(new Refrigerante("Coca-Cola",8.00)); //10%
        pedido.addItem(new Cerveja("Coca-Cola",12.00));  //20%
        pedido.addItem(new Agua("Crystal",2.00)); // isenta
        //Quando (When)
        Double impostos = pedido.getImpostos();
        //Então (Then)
        Assertions.assertEquals(260.0, impostos);
    }

}

//Link: https://www.youtube.com/watch?v=GVo7KzO2agg
// A partir de 45:05