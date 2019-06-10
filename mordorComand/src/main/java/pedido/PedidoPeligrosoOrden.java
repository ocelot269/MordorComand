/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lasencinas.mordorComand;


import interfaces.PedidoPeligroso;
import java.util.UUID;


public class PedidoPeligrosoOrden implements PedidoPeligroso{
    
    String instrucciones;
    String ciudad;
    UUID id = UUID.randomUUID();
    
    public PedidoPeligrosoOrden(String monte_del_destino, String no_ponerselo_en_el_dedo) {
        setCiudad(monte_del_destino);
        setInstrucciones(no_ponerselo_en_el_dedo);
    }
    
    public String getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public UUID getId() {
        return id;
    }
    
    
    
    
    public String instrucciones() {
       return getInstrucciones();
    }

    public int peso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String destino() {
        return getCiudad();
    }
    
}
