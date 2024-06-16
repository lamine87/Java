package com.demo.helloworld.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "hello_world")
public class HelloWorld {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    String string;

    public HelloWorld(String string) {
        this.string = string;
    }

    public HelloWorld() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }


}
