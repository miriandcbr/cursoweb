package ec.mil.issfa.api.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.mil.issfa.api.models.Producto;

public interface ProductoRepository extends JpaRepository<Producto,Long> {
    
}
