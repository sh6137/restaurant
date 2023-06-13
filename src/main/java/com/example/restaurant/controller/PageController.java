package com.example.restaurant.controller;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@NoArgsConstructor
@RequestMapping("/pages")
public class PageController {
    @GetMapping("/main")
    public ModelAndView main(){
        return new ModelAndView("main");
    }
}
