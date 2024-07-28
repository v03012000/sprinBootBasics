package com.example.springboot.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
public class CustomMessageRepositoryImpl implements CustomMessageRepository{

    @Autowired
    MongoTemplate mongoTemplate;
    public void updateItem(String itemName, String newContent){
System.out.println("hiii");
    }

}
