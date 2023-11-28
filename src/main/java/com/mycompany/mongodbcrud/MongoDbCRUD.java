/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mongodbcrud;

/**
 *
 * @author WS
 */

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class MongoDbCRUD {

    public static void main( String[] args ) {
        // Replace the placeholder with your MongoDB deployment's connection string
        String uri = "mongodb+srv://galarioarl:arl123@bookstore-mern.pllil6d.mongodb.net/?retryWrites=true&w=majority";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Bookstore-MERN");
            System.out.println("CONNECTED TO DATABASE: " + database.getName());
            
        }catch(Exception e){
            System.err.print("Error: " + e.getMessage());
        }
    }
}
