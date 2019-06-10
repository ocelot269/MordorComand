
package org.lasencinas.mordorComand;

import interfaces.Pedido;
import interfaces.TratamientoPedido;
import java.util.Set;


class TratamientoPedidoMultiple implements TratamientoPedido{
    Set <Pedido> pedidos;
    int numBultos;
    int pesoTotal;

    TratamientoPedidoMultiple(Set<Pedido> pedidoss) {
       pedidos= pedidoss;
    }

    public Set<Pedido> getPedidos() {
        return pedidos;
    }

    public int getNumBultos() {
        return numBultos;
    }

    public void setNumBultos(int numBultos) {
        this.numBultos = numBultos;
    }

    public int getPesoTotal() {
        return pesoTotal;
    }

    public void setPesoTotal(int pesoTotal) {
        this.pesoTotal += pesoTotal;
    }
   
    void calcularTotalBultos() {
        setNumBultos(getPedidos().size());
    }

    void calcularPesoTotal() {
        for (Pedido pedido : getPedidos()) {
            setPesoTotal(pedido.peso());
        }
    }

    public boolean tratar() {
        if (getPesoTotal() > 0 && getNumBultos() == 3) {
            return true;
        } else {
            return false;
        }
    }
    
    
}
