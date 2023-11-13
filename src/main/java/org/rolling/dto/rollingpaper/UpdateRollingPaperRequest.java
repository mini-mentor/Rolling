package org.rolling.dto.rollingpaper;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class UpdateRollingPaperRequest {
    private long rollingpaperId;
    private String rollingpaperMaker;
    private String rollingpaperReciever;
    private String rollingpaperTitle;
    private Date rollingpaperSubmitDate;
}
