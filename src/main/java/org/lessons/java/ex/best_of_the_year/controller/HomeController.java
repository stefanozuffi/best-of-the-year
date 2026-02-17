package org.lessons.java.ex.best_of_the_year.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/movies/{id}")
    public String getMovieById(@PathVariable int id, Model model) {
    ArrayList<Movie> movies = getBestMovies();
    
    // Cerca il film con quell'id
    Movie found = null;
    for (Movie movie : movies) {
        if (movie.getId() == id) {
            found = movie;
            break;
        } 
    }

    // if (found == null) {
    //     return "redirect:/movies";
    // }
    
    model.addAttribute("movie", found);
    return "singleMovie";
}
    

    @GetMapping("/songs")
    public String getSongs(Model model) {
        ArrayList<Song> songs = getBestSongs();
        model.addAttribute("songs", songs);
        return "songs";
    }

    @GetMapping("/songs/{id}")
    public String getSongById(@PathVariable int id, Model model) {
        ArrayList<Song> songs = getBestSongs();
        
        Song found = null;
        for (Song s : songs) {
            if (s.getId() == id) {
                found = s;
                break;
            }
        }

        // if (found == null) {
        //     return "redirect:/songs";
        // }
        
        model.addAttribute("song", found);
        return "singleSong";
    }









    private ArrayList<Movie> getBestMovies() {
        ArrayList<Movie> res = new ArrayList<Movie>();
        String[] titles = {"Inception", "Interstellar", "The Matrix", "Oppenheimer", "Dune", "Everything Everywhere"};
        
        for (int i=0; i < titles.length; i++) {
            Movie newmovie = new Movie(i, titles[i]); 
            res.add(newmovie); 
        } 

        return res; 
    }

   private ArrayList<Song> getBestSongs() {
        ArrayList<Song> res = new ArrayList<Song>();
        String[] titles = {"Blinding Lights", "Flowers", "Anti-Hero", "As It Was", "Levitating", "Stay"};
        
        for (int i=0; i < titles.length; i++) {
            Song newsong = new Song(i, titles[i]);
            res.add(newsong);
        }

        return res;
    }

    
    
}