package ec.mil.issfa.api.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.mil.issfa.api.models.Producto;
import ec.mil.issfa.api.repositorios.ProductoRepository;

@Service
public class ProductoService {
    @Autowired
    ProductoRepository productoRepository;

    public Producto guardar(Producto producto){
     return    productoRepository.save(producto);
    }
    public Producto actualizar(Producto producto , Producto producto_actualiza){
        producto.setDescripcion(producto_actualiza.getDescripcion());
        producto.setPrecio(producto_actualiza.getPrecio());
        producto.setProveedor(producto_actualiza.getProveedor());
        return    productoRepository.save(producto);

    }

    public void eliminar(Producto producto){
        productoRepository.delete(producto);
    }

    public Optional<Producto> getById(long idProducto){
        return        productoRepository.findById(idProducto);
       }
}
