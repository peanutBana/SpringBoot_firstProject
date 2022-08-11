package com.example.firstProject.entity;

import lombok.AllArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity     //db가 해당 객체를 인식 가능!
@AllArgsConstructor
@ToString
public class Article {

    @Id
    @GeneratedValue     //1,2,3 자동 생성 어노테이션
    private Long id;

    @Column
    private String title;

    @Column
    private String content;

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
