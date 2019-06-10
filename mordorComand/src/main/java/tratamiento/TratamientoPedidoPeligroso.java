/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lasencinas.mordorComand;

import interfaces.PedidoPeligroso;
import interfaces.TratamientoPedido;


public class TratamientoPedidoPeligroso implements TratamientoPedido {
    
    PedidoPeligrosoOrden pedido;
    
    public TratamientoPedidoPeligroso(PedidoPeligroso pedidoPeligroso) {
        setPedido((PedidoPeligrosoOrden) pedidoPeligroso);
    }

    public PedidoPeligrosoOrden getPedido() {
        return pedido;
    }

    public void setPedido(PedidoPeligrosoOrden pedido) {
        this.pedido = pedido;
    }
    
    
    public boolean tratar() {
        if (getPedido().getInstrucciones()== "no ponerselo en el dedo") {
            return false;
        }else {
            return true;
        }
    }
    
}
