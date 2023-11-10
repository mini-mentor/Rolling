package org.rolling.dto.paper;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.rolling.domain.Paper;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddPaperRequest {

    private Long paperId;
    private String paperContent;
    private String paperWriter;

    public Paper toEntity() {
        return Paper.builder()
                .id(paperId)
                .content(paperContent)
                .writer(paperWriter)
                .build();
    }
}
