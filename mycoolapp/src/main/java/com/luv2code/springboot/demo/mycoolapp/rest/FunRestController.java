package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;

    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Team Name : "+this.teamName+" \nCoach Name : "+this.coachName;
    }
    @GetMapping("/")
    public String sayHello(){
        return "Hello from REST Controller";
    }
    @GetMapping("/test")
    public String sayHelloTest(){
        return "Hello from test REST Controller";
    }
}
