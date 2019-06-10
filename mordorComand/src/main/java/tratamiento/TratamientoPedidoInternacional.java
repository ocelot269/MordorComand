package pedido;

import interfaces.TratamientoPedido;

public class TratamientoPedidoInternacional implements TratamientoPedido {
	
	PedidoInternacional pedido ;

	public TratamientoPedidoInternacional(PedidoInternacional pedidoInt) {
		setPedido(pedidoInt);
	}

	public PedidoInternacional getPedido() {
		return pedido;
	}

	public void setPedido(PedidoInternacional pedido) {
		this.pedido = pedido;
	}

	public boolean tratar() {
		if (getPedido().destino()!="Mordor") {
			return true;
		}
		else {
			return false;
		}
	}

}
