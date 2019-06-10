
package org.lasencinas.mordorComand;

import interfaces.Pedido;
import java.util.UUID;


public class PedidoNacional implements Pedido{
    
    String ciudad;
    int peso;
    UUID id = UUID.randomUUID();
    
    
    
    public PedidoNacional(String gondor, int pesos)  {
        setCiudad(gondor);
        setPeso(pesos);
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public UUID getId() {
        return id;
    }
    
    

    public int peso() {
        return getPeso();
    }

    public String destino() {
        return getCiudad();
    }
    
}
