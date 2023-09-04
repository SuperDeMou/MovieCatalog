package dev.SuperDeMou.movies.resource;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.SuperDeMou.movies.domain.Movie;
import dev.SuperDeMou.movies.service.MovieService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.annotation.PostConstruct;

@CrossOrigin(origins = "http://localhost:3000") // Connect to Frontend
@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @PostConstruct
    public void init() {
        if (movieService != null) {
            System.out.println("movieService is injected successfully.");
        } else {
            System.out.println("movieService is not injected.");
        }
    }

    @Operation(summary = "Obter todos os filmes")
    @ApiResponse(responseCode = "200", description = "Resposta bem-sucedida", content = {
            @Content(mediaType = "application/json", schema = @Schema(implementation = Movie.class))
    })
    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies() {
        List<Movie> movies = movieService.allMovies();
        System.out.println("Number of movies returned: " + movies.size());
        return new ResponseEntity<>(movies, HttpStatus.OK);
    }

    @Operation(summary = "Obter um único filme pelo ID do IMDB")
    @ApiResponse(responseCode = "200", description = "Resposta bem-sucedida", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = Movie.class))
    })
    @GetMapping("/{imdbId}")
    public ResponseEntity<Movie> getSingleMovie( @Parameter(description = "ID do IMDB do filme a ser obtido") String imdbId) {
        Movie movie = movieService.singleMovie(imdbId).orElse(null);
        if (movie != null) {
            return new ResponseEntity<>(movie, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}