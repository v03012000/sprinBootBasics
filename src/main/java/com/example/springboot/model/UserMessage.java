package com.example.springboot.model;

import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;
//mongodb+srv://oshintickoo2000:<password>@clustercloudtest.sbse5xv.mongodb.net/?retryWrites=true&w=majority&appName=ClusterCloudTest
@Document("UserMessage")
public class UserMessage {

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Id
    private String id;
    private String name;
    private String category;
    private String content;

    public UserMessage(String id, String name, String category, String content) {
        super();
        this.id = id;
        this.name = name;
        this.category = category;
        this.content = content;
    }
}
