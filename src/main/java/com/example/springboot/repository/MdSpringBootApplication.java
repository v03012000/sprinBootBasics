package com.example.springboot.repository;

import com.example.springboot.model.UserMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@SpringBootApplication
@EnableMongoRepositories
public class MdSpringBootApplication implements CommandLineRunner {

    @Autowired
    MessageRepository mRepo;

    @Autowired
    CustomMessageRepository cRepo;

    public static void main(String... args){
        SpringApplication.run(MdSpringBootApplication.class,args);
    }

    public void run(String... args){
        mRepo.deleteAll();
        createItems();
    }

    void createItems(){
        mRepo.save(new UserMessage("0_message1","message1","screen1","This is the content"));
    }
}
