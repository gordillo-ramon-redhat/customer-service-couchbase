package com.redhat;

import static springfox.documentation.builders.PathSelectors.regex;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

import com.google.common.base.Predicate;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class CustomerServiceCouchbaseApplication {
	
	static Logger logger = LoggerFactory.getLogger(CustomerServiceCouchbaseApplication.class);
	
	public static void main(String[] args) {
        try {
		SpringApplication.run(CustomerServiceCouchbaseApplication.class, args);
        } catch (Exception e){
        	logger.error("Exception in main: ", e);
        }
	}
	
    @Bean
    public Docket swaggerSpringMvcPlugin() {
        return new Docket(DocumentationType.SWAGGER_2)
        		.select()
        			.paths(paths())
        			.build();       	        
    }
    
    private Predicate<String> paths() {
        return 
            regex("/customer.*");
      }
}
