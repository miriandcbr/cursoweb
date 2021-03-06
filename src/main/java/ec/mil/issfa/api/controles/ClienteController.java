package ec.mil.issfa.api.controles;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.mil.issfa.api.models.Cliente;
import ec.mil.issfa.api.services.ClienteService;

@RestController
@RequestMapping("/api")
public class ClienteController {
    /*@GetMapping("/v1/demo/{nombre}")
     public String prueba (@PathVariable String nombre){
         return "hola "+nombre;

     }

     @GetMapping("/v2/demo/{nombre}/{apellido}")
     public String prueba (@PathVariable String nombre,@PathVariable apellido){
         return "hola "+nombre;

     }*/

     @Autowired
     private ClienteService clienteService;

     @GetMapping("/vi/clientes")
     public ResponseEntity<?> get(){
         return ResponseEntity.ok(clienteService.getAll());
     }

     @PostMapping("/v1/clientes")
     public ResponseEntity<?> post(@RequestBody Cliente cliente)
     {
         Cliente clienteAlmacenado =clienteService.guardar(cliente);
         return ResponseEntity.ok(clienteAlmacenado);

     }

     @DeleteMapping("/v1/clientes/{idCliente}")
     public ResponseEntity<?> delete(@PathVariable long idCliente)
     {
         Optional<Cliente>clienteOptional =clienteService.getById(idCliente);
         if(clienteOptional.isPresent()){
             clienteService.eliminar(clienteOptional.get());
             return ResponseEntity.ok("registro borrado");
         }
         else{
             return ResponseEntity.badRequest().body("no existe cliente");
         }
         

     }

}
