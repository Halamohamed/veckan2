package org.hala.enum_demo.enums;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public enum WeekDays {
    MONDAY(LocalTime.parse("08:00"), LocalTime.parse("12:00")),
    TUESDAY(LocalTime.parse("08:00"), LocalTime.parse("15:00")),
    WEDNESDAY(LocalTime.parse("08:00"), LocalTime.parse("16:00")),
    THURSDAY(LocalTime.parse("08:00"), LocalTime.parse("16:00")),
    FRIDAY(LocalTime.parse("08:00"), LocalTime.parse("12:00")),
    SATURDAY(LocalTime.parse("08:00"), LocalTime.parse("15:00")),
    SUNDAY(LocalTime.parse("08:00"), LocalTime.parse("15:00"));

    private LocalTime start;
    private LocalTime end;
    WeekDays(LocalTime start, LocalTime end){
        this.start = start;
        this.end = end;
    }
    public int getWorkingHours(){
      return (int) Duration.between(start,end).toHours();
    }

    public LocalTime getStart() {
        return start;
    }

    public void setStart(LocalTime start) {
        this.start = start;
    }

    public LocalTime getEnd() {
        return end;
    }

    public void setEnd(LocalTime end) {
        this.end = end;
    }
}
