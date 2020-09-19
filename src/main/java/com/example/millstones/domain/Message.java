package com.example.millstones.domain;


import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Message {

    @javax.persistence.Id   //Persistence key for Entity. Must Have !
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String text;
    private String tag;

    public Message() {
    }  //Constructor for Entity without parameters !!!  Must have!!

    public Message(String text, String tag) {
        this.text = text;
        this.tag = tag;
    }



    public Integer getId() {
        return id;
    }


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
