package org.rolling.dto.rollingpaper;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.rolling.domain.RollingPaper;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddRollingPaperRequest {
    private long id;
    private String maker;
    private String receiver;
    private Date submitDate;
    private String title;

    public RollingPaper toEntity(){
        return RollingPaper.builder()
                .id(id)
                .maker(maker)
                .receiver(receiver)
                .submit_date(new Date())
                .title(title)
                .build();
    }
}
