package com.decagon.Week8.controllers;

import com.decagon.Week8.pojos.ApiResponse;
import com.decagon.Week8.pojos.Article;
import com.decagon.Week8.services.ArticleService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ArticleController {

    private  final ArticleService articleService;

    @PostMapping("/api/v1/article/add")
    public ApiResponse addArticle(@RequestBody Article article){
        return articleService.addArticle(article);
    }
}
