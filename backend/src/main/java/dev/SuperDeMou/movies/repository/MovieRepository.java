package dev.SuperDeMou.movies.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import dev.SuperDeMou.movies.domain.Movie;

public interface MovieRepository extends MongoRepository<Movie, String> {
    Optional<Movie> findMovieByImdbId(String imbdId);
}
