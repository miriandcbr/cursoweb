package ec.mil.issfa.api.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ec.mil.issfa.api.dtos.DetallePedidoDto;
import ec.mil.issfa.api.dtos.PedidoDto;
import ec.mil.issfa.api.models.Cliente;
import ec.mil.issfa.api.models.DetallePedido;
import ec.mil.issfa.api.models.Pedido;
import ec.mil.issfa.api.models.Producto;
import ec.mil.issfa.api.repositorios.DetallePedidoRepository;
import ec.mil.issfa.api.repositorios.PedidoRepository;


@Service
public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;
    @Autowired
    private DetallePedidoRepository detallePedidoRepository;
    @Transactional
    public Pedido guardar(Pedido pedido,List<DetallePedido> detalles){
        Pedido pedidoAlmacenado= pedidoRepository.save(pedido);
        for(DetallePedido tmp : detalles){
            tmp.setPedido(pedidoAlmacenado);
            detallePedidoRepository.save(tmp);


        }
        return pedidoAlmacenado;


    }

@Transactional
    public Pedido guardarDto(PedidoDto pedidoDto){

        Pedido pedido = new Pedido();
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
         

         return guardar(pedido, detallesEntidades);


    }

    
}
