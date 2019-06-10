package pedido;

import interfaces.Pedido;
import java.util.UUID;

public class PedidoInternacional implements Pedido {

    String destino;
    int peso;
    UUID id = UUID.randomUUID();

    public PedidoInternacional(String ciudad, int pesos) {
        setDestino(ciudad);
        setPeso(pesos);
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
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
        return getDestino();
    }

}
