package ec.mil.issfa.api.controles;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.mil.issfa.api.dtos.DetallePedidoDto;
import ec.mil.issfa.api.dtos.PedidoDto;
import ec.mil.issfa.api.models.Cliente;
import ec.mil.issfa.api.models.DetallePedido;
import ec.mil.issfa.api.models.Pedido;
import ec.mil.issfa.api.models.Producto;
import ec.mil.issfa.api.services.PedidoService;

@RestController
@RequestMapping("/api")
public class PedidoController {
    @Autowired
    private PedidoService pedidoService;
    @PostMapping("/vi/pedidos")
    public ResponseEntity<?> post(@RequestBody PedidoDto pedidoDto){
       //log.info("alamcendao pediod"+pedidoDto);
       /*Pedido pedido = new Pedido();
       pedido.setFecha(new Date());
       pedido.setSubtotal(pedidoDto.getSubTotal());
       Cliente cliente = new Cliente();
       cliente.setId(pedidoDto.getCliente());
       pedido.setCliente(cliente);

       List<DetallePedido> detallesEntidades = new ArrayList<>();
       for(DetallePedidoDto tmp: pedidoDto.getDetalles()){
           DetallePedido  detallePedido= new DetallePedido();
           detallePedido.setPrecio(tmp.getPrecio());
           detallePedido.setCantidada(tmp.getCantidad());
           Producto producto = new Producto();
           producto.setId(tmp.getProducto());
           detallePedido.setProducto(producto);
           detallesEntidades.add(detallePedido);



       }
        pedidoService.guardar(pedido,detallesEntidades);
        */
        pedidoService.guardarDto(pedidoDto);
  return ResponseEntity.ok("Pedido GRabado");
    }
    
}
