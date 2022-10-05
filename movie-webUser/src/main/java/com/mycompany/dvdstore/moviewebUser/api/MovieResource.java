package com.mycompany.dvdstore.moviewebUser.api;


import com.mycompany.dvdstore.core.entity.Movie;
import com.mycompany.dvdstore.core.service.MovieServiceInterface;
import com.mycompany.dvdstore.moviewebUser.form.MovieForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

;import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieResource {
    @Autowired
    private MovieServiceInterface movieServiceInterface;

    public MovieServiceInterface getMovieServiceInterface() {
        return movieServiceInterface;
    }

    public void setMovieServiceInterface(MovieServiceInterface movieServiceInterface) {

        this.movieServiceInterface = movieServiceInterface;
    }

    // Liste des films
    @GetMapping
    public  Iterable<Movie> list(){
        return  movieServiceInterface.getMovieList();
    }

    // Recuperer un film en particulier
    @GetMapping("/{id}")
    public Movie get(@PathVariable("id") long id){
        return movieServiceInterface.getMovieById(id);
    }

   // Ajouter un film
    @PostMapping
    public Movie add(@RequestBody Movie movie){

        return movieServiceInterface.registerMovie(movie);

    }
}
