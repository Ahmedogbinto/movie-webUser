package com.mycompany.dvdstore;

import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class MovieWebUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieWebUserApplication.class, args);
	}


	@Bean
	public Hibernate5Module dataTypeHiernateModule(){
		return new Hibernate5Module();
	}
}
