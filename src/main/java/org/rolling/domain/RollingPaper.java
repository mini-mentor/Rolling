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
public class RollingPaper {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rollingpaper_id", updatable = false)
    private Long rollingpaper_id;

    @Column(name = "rollingpaper_title", nullable = false)
    private String rollingpaper_title;

    @Column(name = "rollingpaper_content", nullable = true)
    private String rollingpaper_content;

    @Column(name = "rollingpaper_sent_date", nullable = true)
    private Date rollingpaper_date;

    @Column(name = "rollingpaper_sent_from", nullable = true)
    private String rollingpaper_from;

    @Column(name = "rollingpaper_sent_to", nullable = true)
    private String rollingpaper_sent_to;

    @Builder//빌더 패턴으로 객체 생성
    public RollingPaper(String title, String content, Date date, String from, String to) {
        this.rollingpaper_title = title;
        this.rollingpaper_content = content;
        this.rollingpaper_date = date;
        this.rollingpaper_from = from;
        this.rollingpaper_sent_to = to;
    }
}