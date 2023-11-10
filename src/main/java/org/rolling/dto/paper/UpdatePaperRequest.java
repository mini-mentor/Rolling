package org.rolling.dto.paper;

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

    private Long paperId;
    private String paperContent;
    private String paperWriter;
}
