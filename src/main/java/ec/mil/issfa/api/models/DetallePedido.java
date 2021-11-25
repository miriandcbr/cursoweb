package ec.mil.issfa.api.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class DetallePedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private double precio;
    private int cantidada;
    @ManyToOne
    @JoinColumn(name="pedido")
    Pedido pedido;
    @ManyToOne
    @JoinColumn(name="producto")
    Producto producto;
    
    
}
