package com.decagon.Week8.controllers;


import com.decagon.Week8.services.ArticleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
public class WebController {

    private  final ArticleService articleService;

    @RequestMapping(value = "/")
    public String index(Model model){
        model.addAttribute("articles", articleService.getArticles());
        return "index";
    }
}
