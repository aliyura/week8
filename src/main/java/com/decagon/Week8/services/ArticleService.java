package com.decagon.Week8.services;

import com.decagon.Week8.excetptions.AlreadyExistException;
import com.decagon.Week8.pojos.ApiResponse;
import com.decagon.Week8.pojos.Article;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class ArticleService {

    public ApiResponse addArticle(Article request){
        if(request.getCode()==1)
            throw  new AlreadyExistException("Article already exist");
        return  new ApiResponse("Created successfully", HttpStatus.OK.value(), request);
    }

    public List<Article> getArticles(){
        List<Article> articleList= new LinkedList<>();
        articleList.add(new Article(1, "What is Lorem Ipsum?\n"));
        articleList.add(new Article(2, "What is Lorem Ipsum?\n"));
        articleList.add(new Article(3, "What is Lorem Ipsum?\n"));
        articleList.add(new Article(4, "What is Lorem Ipsum?\n"));
        return  articleList;
    }
}
