package ec.mil.issfa.api.dtos;

import lombok.Data;

@Data
public class DetallePedidoDto {
    private long pedido;
    private long producto;
    private int cantidad;
    private double precio;

}
