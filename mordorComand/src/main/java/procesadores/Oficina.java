
package org.lasencinas.mordorComand;

import interfaces.Pedido;
import interfaces.Procesador;
import interfaces.TratamientoPedido;
import pedido.PedidoInternacional;

enum Status {
    ACEPTADO,
    RECHAZADO
}

public class Oficina implements Procesador {
    
   Status e;
   
    
    public Oficina() {
    }

    public boolean procesa(TratamientoPedido pedido) {
        return pedido.tratar();
    }

    public String printarStatus(boolean procesa, Pedido toComarcaWithLove) {
        if (procesa) {
            return toComarcaWithLove.destino() + " " + e.ACEPTADO;
        } else {
            return toComarcaWithLove.destino() + " " + e.RECHAZADO;
        }
    }
    
}
