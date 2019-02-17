package facade;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class MongoFacade {

    private MongoCollection<Document> flowerCollection;

    public MongoFacade(){
        MongoClientURI connectionString = new MongoClientURI("mongodb://localhost:27017");
        MongoClient mongoClient = new MongoClient(connectionString);
        MongoDatabase database = mongoClient.getDatabase("plants");
        database.getCollection("flowerCollection").drop();
        flowerCollection = database.getCollection("flowerCollection");
    }

    public void insertFlower(Flower flower){
        Document document = new Document("name", flower.getName())
                .append("description", flower.getDescription());
        flowerCollection.insertOne(document);
    }

    public List<Flower> getFlowers(){
        List<Flower> flowers = new ArrayList<>();
        MongoCursor<Document> cursor = flowerCollection.find().iterator();
        try {
            while (cursor.hasNext()) {
                Document flower = cursor.next();
                String name = (String) flower.get("name");
                String description = (String) flower.get("description");
                flowers.add(new Flower(name, description));
            }
        } finally {
            cursor.close();
        }
        return flowers;
    }
}

class Flower {
    private String name;
    private String description;

    public Flower(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return name + " [" + description + "]";
    }
}