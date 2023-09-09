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

@Configuration
public class MongoDBConnection {
    @Bean
    MongoClient mongoClient() {
        System.setProperty("javax.net.ssl.keyStore",
                "E:\\Programation\\All Java\\Other projects\\MovieCatalog\\backend\\src\\main\\java\\dev\\SuperDeMou\\movies\\mongodb\\passwordManagment\\keystore.pkcs12");
        System.setProperty("javax.net.ssl.keyStorePassword", "153060@Aa");
        String uri = "mongodb+srv://cluster0.mbpo6wx.mongodb.net/?authSource=%24external&authMechanism=MONGODB-X509&retryWrites=true&w=majority";
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
