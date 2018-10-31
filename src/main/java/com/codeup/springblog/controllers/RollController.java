package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.Random;

@Controller
public class RollController {

    @GetMapping("/roll-dice")
    public String show() {
        return "roll-dice";
    }

    @GetMapping("/roll-dice/{n}")
    @ResponseBody
    public String userGuess(@PathVariable int n, Model vvmodel) {
        Random rand = new Random();
        return  "<div class='display-4'>you guessed: " + n +
                " and the die shows: " + (rand.nextInt(6) + 1) + "</div> " +
                "<div th:replace='footer :: footer'></div>";

//        vvmodel.addAttribute("result", result);


//        String answer;
//        String win = "<div class='display-4'>You win!!</div>";
//        String lose= "<div class='display-4'>You lose!!</div>";
    }

}
