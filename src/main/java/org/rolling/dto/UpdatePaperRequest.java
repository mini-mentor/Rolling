package org.rolling.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class UpdatePaperRequest {

    private Long paper_no;
    private String paper_maker;
    private String paper_receiver;
    private Date paper_submit_date;
}
