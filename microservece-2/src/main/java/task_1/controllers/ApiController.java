package task_1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/serviceB")
public class ApiController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello from Microservice-2";
    }
}