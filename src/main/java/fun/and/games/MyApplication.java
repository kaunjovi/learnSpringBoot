package fun.and.games;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyApplication {
	
	final static Logger logger = LoggerFactory.getLogger(MyApplication.class);
	
	public static void main (String[] args){
		logger.debug("Hello world from Spring Boot.");
		SpringApplication.run(MyApplication.class, args) ; 
	}

}
