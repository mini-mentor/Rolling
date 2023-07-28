package org.rolling.dto;

import lombok.Getter;
import org.rolling.domain.RollingPaper;

import java.util.Date;

@Getter
public class RollingPaperResponse {
    private final String title;
    private final String maker;
    private final String receiver;
    private final Date date;


    public RollingPaperResponse(RollingPaper rollingPaper){
        this.title = rollingPaper.getRollingpaper_title();
        this.maker = rollingPaper.getRollingpaper_from();
        this.receiver= rollingPaper.getRollingpaper_sent_to();
        this.date = rollingPaper.getRollingpaper_date();
    }
}
