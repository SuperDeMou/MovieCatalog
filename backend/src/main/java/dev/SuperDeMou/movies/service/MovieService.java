package dev.SuperDeMou.movies.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.SuperDeMou.movies.domain.Movie;
import dev.SuperDeMou.movies.repository.MovieRepository;

@Service
public class MovieService {
    @Autowired
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> getSingleMovie(String imdbId) {
        return movieRepository.findMovieByImdbId(imdbId);
    }

}