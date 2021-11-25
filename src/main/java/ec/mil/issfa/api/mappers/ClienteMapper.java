package ec.mil.issfa.api.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import ec.mil.issfa.api.models.Cliente;

public class ClienteMapper implements RowMapper<Cliente>{

    @Override
    public Cliente mapRow(ResultSet arg0, int arg1) throws SQLException {
        Cliente cliente = new Cliente();
        cliente.setCedula(arg0.getString("cedula"));
        cliente.setDireccion(arg0.getString("direccion"));
        cliente.setNombre(arg0.getString("nombre"));
        cliente.setTelefono(arg0.getString("telefono"));
        return cliente;
    }
    


    
    
}
