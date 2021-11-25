package ec.mil.issfa.api.controles;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ec.mil.issfa.api.models.Proveedor;

import ec.mil.issfa.api.services.ProveedorService;

@RestController
public class ProveedorController {
    @Autowired
    private ProveedorService proveedorService;
    @PostMapping("/api/proveedores")

    public ResponseEntity<?> post(@RequestBody Proveedor proveedor){
         Proveedor proveedor_almacenado=  proveedorService.guardar(proveedor);
         return ResponseEntity.ok(proveedor_almacenado);

    }
    @DeleteMapping("/api/proveedores/{idProveedor}")
    public ResponseEntity<?> delete(@PathVariable long idProveedor){

       Optional<Proveedor> optionalProveedor=proveedorService.getById(idProveedor);
       if(optionalProveedor.isPresent()){
           proveedorService.eliminar(optionalProveedor.get());
            return ResponseEntity.ok("proveedor borrado");

       }
       else{
  return  ResponseEntity.badRequest().body("proveedor no existe ");
       }


    }
    
}
