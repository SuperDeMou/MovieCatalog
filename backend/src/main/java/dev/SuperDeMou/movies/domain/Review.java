package dev.SuperDeMou.movies.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "reviews")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    @Id
    private ObjectId id;
    @Field
    private String body;

    public Review(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return String.format("Review[id='%s', body='%s']", id, body);
    }
}
