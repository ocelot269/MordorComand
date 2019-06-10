 package interfaces;
/**
 * La interfaz procesador implementa el metodo:
 * 
 * recibe
 * @param  TratamientoPedido 
 * @return   boolean
 *           true si es posible tratar el pedido
 *           false si no es posible tratar el pedido 
 */

public interface Procesador {

    public boolean procesa(TratamientoPedido pedido);

}