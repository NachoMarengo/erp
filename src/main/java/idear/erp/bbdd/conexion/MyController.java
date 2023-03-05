package idear.erp.bbdd.conexion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/users")
    public List<String> getUsers() {
        return (List<String>) jdbcTemplate.queryForList("SELECT * FROM ARTICULO", String.class);
    }
}