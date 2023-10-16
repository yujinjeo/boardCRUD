package com.study.board.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

import java.awt.*;

@Entity
@Data
@Getter
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String title;

    @Column
    private String content;

    private Report() {
    }

    public Report(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
