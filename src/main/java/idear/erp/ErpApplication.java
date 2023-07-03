package idear.erp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import idear.erp.bbdd.MySQLConnectionManager;

@SpringBootApplication
public class ErpApplication {
	
	private static final Logger logger = LogManager.getLogger(ErpApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ErpApplication.class, args);
		
		logger.info("");
		logger.info("");
		logger.info("------------------------");
		logger.info("Servidor iniciado OK!");
		logger.info("------------------------");
		logger.info("");
		logger.info("");

		 Connection connection = null;	
		
        try {
            // Establecer la conexión
        	MySQLConnectionManager coneccion = new MySQLConnectionManager();
        	coneccion.getConnection();
        	
        	logger.info("Hay conecxion con BD: "+coneccion.getUrl());
        } finally {
            // Cerrar la conexión
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
	}

}
