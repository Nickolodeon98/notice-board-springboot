package com.mustache.notice_board.domain.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Article {
    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String contents;

    public Article(String title, String contents) {
        this.title = title;
        this.contents = contents;
    }
}
