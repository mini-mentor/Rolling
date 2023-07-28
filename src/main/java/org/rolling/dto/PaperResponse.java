package org.rolling.dto;

import lombok.Getter;

import java.util.Date;

@Getter
public class PaperResponse {

    private Long paper_no;
    private String paper_maker;
    private String paper_receiver;
    private Date paper_submit_date;

    public PaperResponse(Paper paper) {
        this.paper_no = paper.getPaper_no();
        this.paper_maker = paper.getPaper_maker();
        this.paper_receiver = paper.getPaper_receiver();
        this.paper_submit_date = paper.getPaper_submit_date();
    }
}
