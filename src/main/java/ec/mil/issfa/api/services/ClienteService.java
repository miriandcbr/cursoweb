package ec.mil.issfa.api.services;

import java.util.Optional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import antlr.collections.List;
import ec.mil.issfa.api.models.Cliente;
import ec.mil.issfa.api.repositorios.ClienteRepository;

@Service
public class ClienteService {
    @Autowired
    ClienteRepository clienteRepository;
    public Cliente guardar(Cliente cliente){
        return clienteRepository.save(cliente);

    }
    public Cliente  actualizar(Cliente cliente, Cliente cliente_actualiza){
        cliente.setCedula(cliente_actualiza.getCedula());
        cliente.setDireccion(cliente_actualiza.getDireccion());
        cliente.setNombre(cliente_actualiza.getNombre());
        cliente.setTelefono(cliente_actualiza.getTelefono());
        return clienteRepository.save(cliente);

    }

    public void eliminar(Cliente cliente){
        clienteRepository.delete(cliente);
    }
    public Optional<Cliente> getById(long idCliente){
     return        clienteRepository.findById(idCliente);
    }

    public List<Cliente> getAll(){
      return clienteRepository.findAll();   
    }
    
}
