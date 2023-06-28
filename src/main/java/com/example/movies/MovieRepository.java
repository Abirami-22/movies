package com.example.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface MovieRepository extends MongoRepository<movies, ObjectId> {
Optional<movies> findMovieByImdbId(String imdbid);
}
