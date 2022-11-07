package com.mustache.notice_board.controller;

import com.mustache.notice_board.domain.dto.ArticleDto;
import com.mustache.notice_board.domain.entity.Article;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j
@RequestMapping("/articles")
public class ArticleController {

    @GetMapping("/new")
    public String newArticleForm() {
        return "articles/new";
    }

    @PostMapping("/posts")
    public String createArticle(ArticleDto articleDto) {
        log.info(articleDto.toString());
        Article article = articleDto.toEntity(); // ArticleDto 에서 Article 을 생성한다.
        return "";
    }
}
