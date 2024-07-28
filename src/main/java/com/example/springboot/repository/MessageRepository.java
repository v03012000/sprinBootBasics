package com.example.springboot.repository;
import com.example.springboot.model.UserMessage;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface MessageRepository  extends MongoRepository<UserMessage,String> {

    @Query("{name:'?0'}")
    UserMessage findItemByName(String name);

    @Query(value="{category:'?0'}",fields="{'name':1}")
    List<UserMessage> findAll(String category);

    public long count();
}
