package com.example.firstProject.controller;

import com.example.firstProject.dto.ArticleForm;
import com.example.firstProject.entity.Article;
import com.example.firstProject.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {

    @Autowired  //스프링 부트가 미리 생성해놓은 객체를 가져다가 자동 연결
    private ArticleRepository articleRepository;

    @GetMapping("articles/new")
    public String newArticleForm(){
        return "articles/new";
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form){      //dto
        System.out.println(form.toString());

        //1.dto -> Entity
        Article article = form.toEntity();
        System.out.println(article.toString());
        //2.Repository에게 DB저장시킴
        Article saved= articleRepository.save(article);
        System.out.println(saved.toString());
        return "";
    }
}
