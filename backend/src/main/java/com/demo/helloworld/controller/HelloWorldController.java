package com.demo.helloworld.controller;

import com.demo.helloworld.entity.HelloWorld;
import com.demo.helloworld.repository.HelloWorldRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/helloworld")
public class HelloWorldController {

    HelloWorldRepository repository;

    HelloWorldController(HelloWorldRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/{id}")
    public HelloWorld getOneById(@PathVariable int id) {
        return repository.findById(id);
    }

    @GetMapping("/all")
    public List<HelloWorld> getAll() {
        return repository.findAll();
    }

    @PutMapping()
    public HelloWorld save(@RequestParam String string) {
        return repository.save(new HelloWorld(string));
    }

    @DeleteMapping()
    public void delete(@RequestParam int id) {
        HelloWorld helloWorld = repository.findById(id);
        repository.delete(helloWorld);
    }

}
