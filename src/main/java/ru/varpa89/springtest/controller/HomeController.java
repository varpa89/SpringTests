package ru.varpa89.springtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by pasha on 28.03.2014.
 */
@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    public String loadIndexPage(Model model){
        model.addAttribute("title", "Hello Spring");
        return "index";
    }
}
