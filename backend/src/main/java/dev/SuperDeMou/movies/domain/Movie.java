package dev.SuperDeMou.movies.domain;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor 
@Document(collection = "movies")
public class Movie {
    @Id
    @Field("_id")
    private String id;
    @Field
    private String imdbId;
    @Field
    private String title;
    @Field
    private String releaseDate;
    @Field
    private String trailerLink;
    @Field
    private String poster;
    @Field
    private List<String> genres;
    @Field
    private List<String> backdrops;
    @Field
    @DocumentReference
    private List<Review> reviews;

    @Override
    public String toString() {
        return String.format("Movie[_id={\"$oid\":\"%s\"}, imdbId='%s', title='%s', releaseDate='%s', trailerLink='%s', poster='%s', genres=%s, backdrops=%s, reviews=%s]",
            id, imdbId, title, releaseDate, trailerLink, poster, genres, backdrops, reviews);
    }    
    
}
