package com.mycompany.dvdstore.moviewebUser.controller;


import com.mycompany.dvdstore.core.entity.Movie;
import com.mycompany.dvdstore.core.service.MovieServiceInterface;;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Scanner;

@Controller
@RequestMapping ("/movie")
public class MovieController {
    @Autowired
    private MovieServiceInterface movieServiceInterface;

    public MovieServiceInterface getMovieServiceInterface() {
        return movieServiceInterface;
    }

    public void setMovieServiceInterface(MovieServiceInterface movieServiceInterface) {

        this.movieServiceInterface = movieServiceInterface;
    }

    @GetMapping("/{id}")
    public String displayMovieCard(@PathVariable("id") long id, Model model){
        model.addAttribute("movie", movieServiceInterface.getMovieById(id));
        return "movie-details";
    }


    @PostMapping
    public String addMovie(@ModelAttribute Movie movie){

        movieServiceInterface.registerMovie(movie);
        return "movie-added";

    }
}
