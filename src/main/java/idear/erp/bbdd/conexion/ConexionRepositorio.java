package idear.erp.bbdd.conexion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class ConexionRepositorio {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Conexion> findAll() {
        return jdbcTemplate.query("SELECT * FROM my_table", new BeanPropertyRowMapper<>(Conexion.class));
    }
}
