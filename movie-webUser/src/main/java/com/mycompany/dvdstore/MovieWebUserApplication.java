package com.mycompany.dvdstore;

import com.mycompany.dvdstore.core.entity.Movie;
import com.mycompany.dvdstore.core.service.MovieServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

@SpringBootApplication
public class MovieWebUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieWebUserApplication.class, args);
	}

	@Controller
	public static class MovieController {
		@Autowired
		private MovieServiceInterface movieServiceInterface;

		public MovieServiceInterface getMovieServiceInterface() {
			return movieServiceInterface;
		}

		public void setMovieServiceInterface(MovieServiceInterface movieServiceInterface) {

			this.movieServiceInterface = movieServiceInterface;
		}

		public void addMovieUsing(){
			System.out.println( "Quel est le titre du film a ajouté?" );
			Scanner scanner = new Scanner(System.in);
			String title = scanner.nextLine();
			Movie movie = new Movie();
			movie.setTitle(title);
			System.out.println( "Quel est le genre du film ?" );
			String genre= scanner.nextLine();
			movie.setGenre(genre);

			movieServiceInterface.registerMovie(movie);


		}
	}
}
