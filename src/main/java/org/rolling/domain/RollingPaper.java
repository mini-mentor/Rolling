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
@Table(name = "rollingpaper")
public class RollingPaper {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long rollingpaperId;

    @Column(name = "maker")
    private String rollingpaperMaker;

    @Column(name = "receiver")
    private String rollingpaperReceiver;

    @Column(name = "submit_date")
    private Date rollingpaperSubmitDate;

    @Column(name = "title")
    private String rollingpaperTitle;

    @Builder//빌더 패턴으로 객체 생성
    public RollingPaper(long id, String maker, String receiver, Date submit_date, String title) {
        this.rollingpaperId = id;
        this.rollingpaperMaker = maker;
        this.rollingpaperReceiver = receiver;
        this.rollingpaperSubmitDate = submit_date;
        this.rollingpaperTitle = title;
    }
}