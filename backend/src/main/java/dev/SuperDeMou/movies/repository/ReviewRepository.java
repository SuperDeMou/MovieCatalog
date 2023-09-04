package dev.SuperDeMou.movies.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import dev.SuperDeMou.movies.domain.Review;

public interface ReviewRepository extends MongoRepository<Review, ObjectId> {

}
