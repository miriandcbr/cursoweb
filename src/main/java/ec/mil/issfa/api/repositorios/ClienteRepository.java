package ec.mil.issfa.api.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.mil.issfa.api.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {
    Cliente findByCedula(String cedula);
    List<Cliente> findByNombre(String nombre);
    
}
