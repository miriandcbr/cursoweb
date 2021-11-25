package ec.mil.issfa.api.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.mil.issfa.api.models.Proveedor;
import ec.mil.issfa.api.repositorios.ProveedorRepository;

@Service
public class ProveedorService {
    @Autowired
    ProveedorRepository proveedorRepository;
    public Proveedor guardar(Proveedor proveedor){
        return proveedorRepository.save(proveedor);
        
    }

    public Proveedor actualizar(Proveedor proveedor, Proveedor proveedor_actualiza){
       proveedor.setDireccion(proveedor_actualiza.getDireccion());
       proveedor.setNombre(proveedor_actualiza.getNombre());
       proveedor.setRuc(proveedor_actualiza.getRuc());
       proveedor.setTelefono(proveedor_actualiza.getTelefono());
        return proveedorRepository.save(proveedor);
        
    }

    public void eliminar(Proveedor proveedor){
        proveedorRepository.delete(proveedor);
    }
    
    public Optional<Proveedor> getById(long idProveedor){
        return        proveedorRepository.findById(idProveedor);
       }
}
