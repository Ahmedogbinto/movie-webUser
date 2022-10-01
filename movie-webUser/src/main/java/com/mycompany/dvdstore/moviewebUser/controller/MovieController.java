package com.mycompany.dvdstore.moviewebUser.controller;


import com.mycompany.dvdstore.core.entity.Movie;
import com.mycompany.dvdstore.core.service.MovieServiceInterface;;
import com.mycompany.dvdstore.moviewebUser.form.MovieForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Scanner;

@Controller
@RequestMapping("/movie")
public class MovieController {
    @Autowired
    private MovieServiceInterface movieServiceInterface;

    public MovieServiceInterface getMovieServiceInterface() {
        return movieServiceInterface;
    }

    public void setMovieServiceInterface(MovieServiceInterface movieServiceInterface) {
        this.movieServiceInterface = movieServiceInterface;
    }

    /*@GetMapping("/{id}")
    public String displayMovieCard(@PathVariable("id") long id, Model model){
        model.addAttribute("movie", movieServiceInterface.getMovieById(id));
        return "movie-details";
    }*/


    @PostMapping("/add")
    public String addMovie(@Valid @ModelAttribute MovieForm movieForm, BindingResult results){
        if(results.hasErrors()){
            return "add-movie-form";
        }
        Movie movie = new Movie();
        movie.setTitle(movieForm.getTitle());
        movie.setGenre(movieForm.getGenre());
        movie.setDescription(movieForm.getDescription());

        movieServiceInterface.registerMovie(movie);
        return "movie-added";
    }
}
