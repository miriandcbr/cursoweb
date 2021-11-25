package ec.mil.issfa.api.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.mil.issfa.api.models.DetallePedido;

public interface DetallePedidoRepository extends JpaRepository<DetallePedido,Long> {
    
}
