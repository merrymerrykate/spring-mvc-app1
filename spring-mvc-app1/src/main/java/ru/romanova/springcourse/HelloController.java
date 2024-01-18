package ru.romanova.springcourse;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello-world")
    public String sayhello(){
        return "hello_world.html";
    }

}
