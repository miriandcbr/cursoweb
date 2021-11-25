package ec.mil.issfa.api.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.mil.issfa.api.models.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido,Long> {
    
}
