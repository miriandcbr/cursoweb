package ec.mil.issfa.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.mil.issfa.api.repositorios.DetallePedidoRepository;
import ec.mil.issfa.api.repositorios.PedidoRepository;

@Service
public class PedidosService {
    @Autowired
    PedidoRepository pedidoRepository;
    DetallePedidoRepository detallePedidoRepository;
    public void grabar()
    
    {

    }


    
}
