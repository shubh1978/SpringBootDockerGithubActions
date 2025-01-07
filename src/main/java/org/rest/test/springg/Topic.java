package org.rest.test.springg;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String name;
    private String description;

    public Topic() {
    }

    public Topic(String id , String name , String description){
        super();
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public String getid(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }

    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }


    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }
}
