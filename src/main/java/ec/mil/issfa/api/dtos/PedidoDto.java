package ec.mil.issfa.api.dtos;

import java.util.List;

import lombok.Data;

@Data
public class PedidoDto {
    private long cliente;
    private  List<DetallePedidoDto> detalles;
    public double getSubTotal(){
        double subtotal=0;
        for(DetallePedidoDto tpm: detalles){
              subtotal = subtotal+(tpm.getPrecio()*tpm.getCantidad());

        }
         return subtotal;

    }
}
