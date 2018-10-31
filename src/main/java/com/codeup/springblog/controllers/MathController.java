package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {


    @RequestMapping("/add/{x}/and/{y}")
    @ResponseBody
    public String add(@PathVariable int x, @PathVariable int y){
        return " Here is your answer: " + (x + y);
    }
    @RequestMapping("/sub/{x}/from/{y}")
    @ResponseBody
    public String sub(@PathVariable int x, @PathVariable int y){
        return " Here is your answer: " + (y - x);
    }

    @RequestMapping("/multiply/{x}/and/{y}")
    @ResponseBody
    public String mul(@PathVariable int x, @PathVariable int y){
        return " Here is your answer: " + (x * y);
    }

    @RequestMapping("/divide/{x}/by/{y}")
    @ResponseBody
    public String div(@PathVariable int x, @PathVariable int y){
        return " Here is your answer: " + (x / y);
    }


}
