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
    @Column(name = "paper_no", updatable = false) // 롤링페이퍼 번호
    private Long paper_no;

    @Column(name = "paper_maker", nullable = false) // 롤링페이퍼를 만든 사람
    private String paper_maker;

    @Column(name = "paper_receiver", nullable = false) // 받는 사람 이름
    private String paper_receiver;

    @Column(name = "paper_submit_date", nullable = false) // 롤링페이퍼 전송 시점
    private Date paper_submit_date;

//    fk user_id : 유저가 가지고 있는 아이디

    @Builder
    public Paper(Long paper_no, String paper_maker, String paper_receiver, Date paper_submit_date) {
        this.paper_no = paper_no;
        this.paper_maker = paper_maker;
        this.paper_receiver = paper_receiver;
        this.paper_submit_date = paper_submit_date;
    }

    public void update(Long paper_no, String paper_maker, String paper_receiver, Date paper_submit_date) {
        this.paper_no = paper_no;
        this.paper_maker = paper_maker;
        this.paper_receiver = paper_receiver;
        this.paper_submit_date = paper_submit_date;
    }
}