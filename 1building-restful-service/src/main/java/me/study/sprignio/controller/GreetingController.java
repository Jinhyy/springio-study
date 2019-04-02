package me.study.sprignio.controller;

import me.study.sprignio.domain.Greeting;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    private final AtomicLong counter = new AtomicLong();

    @GetMapping
    public Greeting greeting(@RequestParam(name = "name", defaultValue = "defaultValue") String name){
        return new Greeting(counter.getAndIncrement(), name);
    }
}
