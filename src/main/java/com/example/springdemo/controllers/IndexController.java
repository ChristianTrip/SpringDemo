package com.example.springdemo.controllers;

import org.springframework.web.bind.annotation.*;
import services.WeekDay;

@RestController
public class IndexController {

    @GetMapping("/hello")
    public String great(){
        return "Hello User, lovely day, eh!";
    }

    @GetMapping("/echo")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "Random Person") String name) {
        return String.format("Greetings and salutations dear %s, How may I serve you this fine day?", name);
    }

    @GetMapping("/isItFriday")
    public String displayDay(){

        if (WeekDay.itsFriday()){
            return "It's friday, friday, gotta get down on friday! Have a nice Weekend";
        }

        return "Sorry! its only " + WeekDay.getDay(WeekDay.currentDay) + ", there are " + WeekDay.daysUntilFriday() + " days left";
    }

}
