package dev.SuperDeMou.movies.mongodb.passwordManagment;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;

import org.bson.Document;
import org.bson.BsonDocument;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;

public class Main {

    public static void main(String args[]) {
        System.setProperty("javax.net.ssl.keyStore","backend/src/main/java/dev/SuperDeMou/movies/mongodb/passwordManagment/keystore.pkcs12");
        System.setProperty("javax.net.ssl.keyStorePassword", "153060@Aa");

        String uri = "mongodb+srv://cluster0.mbpo6wx.mongodb.net/?authSource=%24external&authMechanism=MONGODB-X509&retryWrites=true&w=majority";
        ConnectionString connectionString = new ConnectionString(uri);
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .serverApi(ServerApi.builder()
                        .version(ServerApiVersion.V1)
                        .build())
                .build();
        MongoClient mongoClient = MongoClients.create(settings);
        MongoDatabase database = mongoClient.getDatabase("testDb");
        MongoCollection<Document> collection = database.getCollection("testCol");
        BsonDocument filter = new BsonDocument();
        System.out.println(collection.countDocuments(filter));

        // Consulta para buscar todos os documentos na coleção
        FindIterable<Document> documents = collection.find();

        // Itera sobre os documentos e os exibe
        try (MongoCursor<Document> cursor = documents.iterator()) {
            while (cursor.hasNext()) {
                Document document = cursor.next();
                System.out.println(document.toJson());
            }
        }
    }
}