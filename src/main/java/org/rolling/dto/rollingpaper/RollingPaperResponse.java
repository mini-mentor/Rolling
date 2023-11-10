package org.rolling.dto.rollingpaper;

import lombok.Getter;
import org.rolling.domain.RollingPaper;

import java.util.Date;

@Getter
public class RollingPaperResponse {
    private final long rollingpaperId;
    private final String rollingpaperTitle;
    private final String rollingpaperMaker;
    private final String rollingpaperReceiver;
    private final Date rollingpaperSubmitDate;


    public RollingPaperResponse(RollingPaper rollingPaper){
        this.rollingpaperId = rollingPaper.getRollingpaperId();
        this.rollingpaperTitle = rollingPaper.getRollingpaperTitle();
        this.rollingpaperMaker = rollingPaper.getRollingpaperMaker();
        this.rollingpaperReceiver = rollingPaper.getRollingpaperReceiver();
        this.rollingpaperSubmitDate = rollingPaper.getRollingpaperSubmitDate();
    }
}
