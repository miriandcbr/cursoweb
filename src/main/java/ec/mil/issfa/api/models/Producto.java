package ec.mil.issfa.api.models;

import javax.persistence.Entity;


import lombok.Data;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Data
@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String descripcion;
    private double precio;
    @ManyToOne
    @JoinColumn(name="proveedor")
    Proveedor proveedor;

    
}
