package org.rolling.dto.rollingpaper;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.rolling.domain.RollingPaper;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
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
    Date date = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
    Calendar cal = Calendar.getInstance();
    String today = formatter.format(cal.getTime());
    Timestamp ts = Timestamp.valueOf(today);

    public RollingPaper toEntity() {
        return RollingPaper.builder()
                .id(id)
                .maker(maker)
                .receiver(receiver)
                .submit_date(ts)
                .title(title)
                .build();
    }
}
