package org.rolling.dto.paper;

import lombok.Getter;
import org.rolling.domain.Paper;

import java.util.Date;

@Getter
public class PaperResponse {

    private final Long paperId;
    private final String paperContent;
    private final String paperWriter;

    public PaperResponse(Paper paper) {
        this.paperId = paper.getPaperId();
        this.paperContent = paper.getPaperContent();
        this.paperWriter = paper.getPaperWriter();
    }
}
