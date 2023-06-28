package com.example.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {
    @Autowired
    private MovieService movieService;
    @GetMapping("/all")
    public ResponseEntity<List<movies>> getallMovies(){
        return new ResponseEntity<List<movies>>(movieService.allMovies(), HttpStatus.OK);
    }
    @GetMapping("/{imdbid}")
    public ResponseEntity<Optional<movies>> getSingleMovie(@PathVariable String imdbid){
        return new ResponseEntity<Optional<movies>>(movieService.singleMovie(imdbid),HttpStatus.OK);
    }

}
