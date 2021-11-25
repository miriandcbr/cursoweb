package ec.mil.issfa.api.models;

import java.util.Date;

import javax.persistence.Entity;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date fecha;
    private double subtotal;
    @ManyToOne
    @JoinColumn(name="cliente")
    Cliente cliente;
    
}
