package ec.mil.issfa.api.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.mil.issfa.api.models.Proveedor;

public interface ProveedorRepository extends JpaRepository<Proveedor,Long> {
    
}
