package idear.erp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
	}

}
