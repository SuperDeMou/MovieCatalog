package dev.SuperDeMou.movies.mongodb;

import org.bson.Document;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import dev.SuperDeMou.movies.mongodb.passwordManagment.PasswordEncryptor;

@Configuration
public class MongoDBConnection {
    @Bean
    MongoClient mongoClient() {
        System.setProperty("javax.net.ssl.keyStore",
                "E:\\Programation\\All Java\\Other projects\\MovieCatalog\\backend\\src\\main\\java\\dev\\SuperDeMou\\movies\\mongodb\\passwordManagment\\keystore.jks");
        System.setProperty("javax.net.ssl.keyStorePassword", PasswordEncryptor.decryptPassword());
        String uri = PasswordEncryptor.decryptCluster();
        ConnectionString connectionString = new ConnectionString(uri);
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .serverApi(ServerApi.builder()
                        .version(ServerApiVersion.V1)
                        .build())
                .build();
        return MongoClients.create(settings);
    }

    @Bean
    MongoDatabase mongoDatabase() {
        MongoClient mongoClient = mongoClient();
        return mongoClient.getDatabase("MovieAPI");
    }

    @Bean
    MongoCollection<Document> moviesCollection() {
        MongoDatabase database = mongoDatabase();
        return database.getCollection("movies");
    }

    @Bean
    MongoCollection<Document> reviewsCollection() {
        MongoDatabase database = mongoDatabase();
        return database.getCollection("reviews");
    }
}