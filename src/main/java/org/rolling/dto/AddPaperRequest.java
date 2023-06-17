package org.rolling.dto;

import com.fasterxml.jackson.databind.DatabindException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.rolling.domain.Paper;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddPaperRequest {

    private Long paper_no;
    private String paper_maker;
    private String paper_receiver;
    private Date paper_submit_date;

    public Paper toEntity() {
        return Paper.builder()
                .paper_no(paper_no)
                .paper_maker(paper_maker)
                .paper_receiver(paper_receiver)
                .paper_submit_date(paper_submit_date)
                .build();
    }
}
