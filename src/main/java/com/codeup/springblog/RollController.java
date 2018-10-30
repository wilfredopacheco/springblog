package com.codeup.springblog;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class RollController {

    @GetMapping("/roll-dice")
    @ResponseBody
    public String guess(){
        return "Please enter your guess...";
    }

    @GetMapping("/roll-dice/{n}")
    @ResponseBody
    public String roll(@PathVariable int n){
        Random rand = new Random();
        return "you guessed: " + n + "and the die shows: " + rand.nextInt(6);
    }
}
