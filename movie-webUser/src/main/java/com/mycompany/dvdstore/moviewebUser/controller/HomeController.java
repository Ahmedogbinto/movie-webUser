package com.mycompany.dvdstore.moviewebUser.controller;

import com.mycompany.dvdstore.core.entity.Movie;
import com.mycompany.dvdstore.core.service.MovieServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private MovieServiceInterface movieServiceInterface;

    public MovieServiceInterface getMovieServiceInterface() {
        return movieServiceInterface;
    }

    public void setMovieServiceInterface(MovieServiceInterface movieServiceInterface) {
        this.movieServiceInterface = movieServiceInterface;
    }

    @GetMapping("/dvdstore-home")
    public @ModelAttribute("movies") List<Movie> displayHome(){
        List<Movie> movies = movieServiceInterface.getMovieList();
        return movies;
    }

    @GetMapping("/")
    public void displayMovieForm(@ModelAttribute Movie movie){

    }

}
