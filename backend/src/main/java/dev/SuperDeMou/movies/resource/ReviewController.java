package dev.SuperDeMou.movies.resource;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.SuperDeMou.movies.domain.Review;
import dev.SuperDeMou.movies.service.ReviewService;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewController {
    @Autowired
    private ReviewService service;

    @Operation(summary = "Esse metodo recebe um corpo de requisição no formato JSON, que é mapeado para um objeto do tipo Map<String, String>")
    @PostMapping
    public ResponseEntity<Review> createReview(@RequestBody Map<String,String> payload){
        return new ResponseEntity<Review>(service.createReview(payload.get("reviewBody"), payload.get("imdbId")), HttpStatus.CREATED);

    }
}
