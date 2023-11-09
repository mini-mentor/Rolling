package org.rolling.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.rolling.domain.RollingPaper;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddRollingPaperRequest {
    private String title;
    private String content;
    private String maker;
    private String receiver;

    public RollingPaper toEntity(){
        return RollingPaper.builder()
                .title(title)
                .content(content)
                .from(maker)
                .to(receiver)
                .date(new Date())
                .build();
    }
}
