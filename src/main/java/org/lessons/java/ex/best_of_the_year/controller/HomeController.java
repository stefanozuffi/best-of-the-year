package org.lessons.java.ex.best_of_the_year.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.lessons.java.ex.best_of_the_year.classes.Movie;
import org.lessons.java.ex.best_of_the_year.classes.Song;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }
    
    @GetMapping("/welcome")
    public String getWelcome(@RequestParam(name = "name") String name, Model model) {
        
        model.addAttribute("name", name);
        
        return "welcome";
    }

    @GetMapping("/movies")
    public String getMovies(Model model) {
        ArrayList<Movie> movies = getBestMovies();
        model.addAttribute("movies", movies);
        return "movies";
    }

    @GetMapping("/songs")
    public String getSongs(Model model) {
        ArrayList<Song> songs = getBestSongs();
        model.addAttribute("songs", songs);
        return "songs";
    }

    private ArrayList<Movie> getBestMovies() {
        ArrayList<Movie> res = new ArrayList<Movie>();
        
        for (int i=0; i <= 5; i++) {
            String newTitle = "title" + i;
            Movie newmovie = new Movie(newTitle);
            res.add(newmovie);
        }

        return res;
    }

   private ArrayList<Song> getBestSongs() {
        ArrayList<Song> res = new ArrayList<Song>();
        
        for (int i=0; i <= 5; i++) {
            String newTitle = "title" + i;
            Song newsong = new Song(newTitle);
            res.add(newsong);
        }

        return res;
    }

    
    
}