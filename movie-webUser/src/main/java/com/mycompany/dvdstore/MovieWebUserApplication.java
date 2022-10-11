package com.mycompany.dvdstore;

import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;
import com.mycompany.dvdstore.core.entity.Movie;
import com.mycompany.dvdstore.core.service.MovieServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

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
