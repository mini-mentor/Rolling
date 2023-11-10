package org.rolling.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "paper")
public class Paper {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false) // 롤링페이퍼 번호
    private Long paperId;

    @Column(name = "content") // 롤링페이퍼를 만든 사람
    private String paperContent;

    @Column(name = "writer")
    private String paperWriter;

    @Builder
    public Paper(long id, String content, String writer) {
        this.paperId = id;
        this.paperContent = content;
        this.paperWriter = writer;
    }

    public void update(long id, String content, String writer) {
        this.paperId = id;
        this.paperContent = content;
        this.paperWriter = writer;
    }
}