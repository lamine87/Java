package com.demo.helloworld.repository;

import com.demo.helloworld.entity.HelloWorld;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNullApi;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HelloWorldRepository extends JpaRepository<HelloWorld, Integer> {

    HelloWorld findByString(String string);

    HelloWorld findById(int id);

    List<HelloWorld> findAll();

    HelloWorld save(HelloWorld helloWorld);

    void delete(HelloWorld helloWorld);
}
