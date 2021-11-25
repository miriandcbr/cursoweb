package ec.mil.issfa.api.daos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import ec.mil.issfa.api.mappers.ClienteMapper;
import ec.mil.issfa.api.models.Cliente;

@Component
public class ClienteDao {
    @Autowired
    private JdbcTemplate jdbTemplate;

    public Cliente getById(Long id){
        Cliente cliente = new Cliente();
        String query ="select * from cliente where id ="+id;

        jdbTemplate.queryForObject(query, new ClienteMapper());
        return cliente;
    }

}
