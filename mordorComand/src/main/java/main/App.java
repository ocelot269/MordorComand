package main;

import interfaces.Pedido;
import interfaces.PedidoPeligroso;
import interfaces.TratamientoPedido;
import org.lasencinas.mordorComand.Oficina;
import org.lasencinas.mordorComand.PedidoPeligrosoOrden;
import org.lasencinas.mordorComand.TratamientoPedidoPeligroso;
import pedido.PedidoInternacional;
import pedido.TratamientoPedidoInternacional;



/**
 * Crea una oficina que procesa pedidos.
 * 
 * En funcion de si el tratamiento del pedido es posible o no
 * la oficina procesa el pedido (true /false) 
 * e informa de su estado (aceptado /rechazado).
 * 
 * Como los pedidos pueden ser de multiples tipos, 
 * muchos de ellos aun desconocidos y cada uno 
 * con sus particularidades propias,
 * vamos a usar el patron COMMAND.
 * 
 * Consulta el manual de referencia para ver un ejemplo del patron.
 * 
 * Aplicando el patron COMMAND no procesaremos pedidos,
 * sino que le pasaremos a la oficina /procesador
 * el tipo de tratamiento que ha de aplicar a cada pedido,
 * y sera el propio pedido el que decida como debe ser tratado.
 * 
 * PASA LOS CASOS TEST PROPUESTOS y utilizalos como guia para el desarrollo.
 * NO PUEDES MODIFICAR EL CODIGO DE LOS CASOS TEST 
 * 
 * La clase App.java contiene el MAIN y ha de funcionar.
 * NO PUEDES MODIFICAR EL CODIGO DEL MAIN
 * 
 * Crea un proyecto MAVEN siguiendo el esquema: org.mvpigs.commandpattern
 * Respeta la estructura del proyecto indicada 
 * en el nombre de los paquetes que se indican en los casos test. 
 * 
 * - Realiza commits periódicamente mientras avanzas en el desarrollo de la aplicación.
 * - Publica tu solucion en GitHub.
 * - Enviame tu proyecto comprimido en un ZIP a gelpiorama@gmail.com
 * 
 * No olvides dibujar a mano alzada el DIAGRAMA DE CLASES UML de tu solucion
 * para completar la evaluacion de la parte practica de ED. 
 */

public class App {

    public static void main(String[] args) {

        Oficina oficina = new Oficina();

        Pedido pedido = new PedidoInternacional("Comarca", 10);
        TratamientoPedido tratamientoInt = new TratamientoPedidoInternacional(
                                                    (PedidoInternacional) pedido);
        
        System.out.println(oficina.printarStatus(oficina.procesa(tratamientoInt), pedido));

        pedido = new PedidoInternacional("Mordor", 10);
        tratamientoInt = new TratamientoPedidoInternacional((PedidoInternacional) pedido);
        
        System.out.println(oficina.printarStatus(oficina.procesa(tratamientoInt), pedido));

        pedido = new PedidoPeligrosoOrden("Cima de los vientos", 
                                          "no limpiarse las uñas con este puñal");
        TratamientoPedido peligroso = new TratamientoPedidoPeligroso((PedidoPeligroso) pedido);
        
        System.out.println(oficina.printarStatus(oficina.procesa(peligroso), pedido));

        pedido = new PedidoPeligrosoOrden("Monte del destino", 
                                          "no ponerselo en el dedo");
        peligroso = new TratamientoPedidoPeligroso((PedidoPeligroso) pedido);
        
        System.out.println(oficina.printarStatus(oficina.procesa(peligroso), pedido));
        
        /**
         * Los pedidos multiples se completan en el ultimo de los casos test 
         */
    }
}
