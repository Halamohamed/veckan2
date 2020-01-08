package org.hala.VTwo;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TimeAPI {
    public static void main(String[] args) {
        //Exc1
        LocalDate today = LocalDate.now();
        System.out.println("today is: "+today);

        //Exc2
        LocalDate dayPattern = LocalDate.parse("2018-03-29");
        String todayPattern = dayPattern.format(DateTimeFormatter.ofPattern("eeee dd MMM"));

        System.out.println(todayPattern);

        //Exc3
        LocalDate lastMonday = LocalDate.now();
        LocalDate lMonday = lastMonday.minus(Period.ofDays(1));

        //System.out.println("last monday: " + lMonday.getDayOfWeek() + lMonday);

        //Exc4
        LocalDate myDay = LocalDate.parse("2020-01-07");

        System.out.println(myDay);

        //Exc5
        LocalDate dayOfWeek = LocalDate.of(1945,05,8);
        DayOfWeek dayOfWeek1 = dayOfWeek.getDayOfWeek();
        System.out.println("day of week: " + dayOfWeek1 + " day of month: "+ dayOfWeek.getDayOfMonth());

        //Exc6
        LocalDate todayPlus10 = today.plus(Period.ofYears(10).minus(Period.ofMonths(10)));
        System.out.println(todayPlus10);

        //Exc7
        LocalDate birthdate = LocalDate.of(1985,12,24);
        Period period = Period.between(birthdate,todayPlus10);

        //System.out.println("years "+ period.getYears() + " months " + period.getMonths() + " days " + period.getDays());

        //Exc8
        Period period1 = Period.ofYears(4).plus(Period.ofMonths(7)).plus(Period.ofDays(29));
        LocalDate currentDay = LocalDate.now().plus(period1);
        System.out.println(today);
        System.out.println(currentDay);

        //Exc9
        LocalTime localTime = LocalTime.now();
        System.out.println("local time: " + localTime);

        //Exc10
        int nanoSeconds = localTime.getNano();
        System.out.println("nano seconds: " + nanoSeconds);

        //Exc11
        LocalTime localTimeString = LocalTime.parse("21:53");
        System.out.println(localTimeString);

        //Exc12
        String formatTime = localTime.format(DateTimeFormatter.ISO_LOCAL_TIME);
        System.out.println(formatTime);
        System.out.println(localTime.truncatedTo(ChronoUnit.SECONDS));

        //Exc13
        LocalDateTime localDateTime = LocalDateTime.of(2018,04,05,10,00);
        String fifthApril = localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        String clock10 = localDateTime.format(DateTimeFormatter.ofPattern("hh:mm"));
        System.out.println("date: " + fifthApril + ", time: " + clock10);

        //Exc14
        //LocalDateTime localDateTimeFormat = LocalDateTime.parse(fifthApril, DateTimeFormatter.ofPattern(clock10));
        String localDateTimeString = localDateTime.format(DateTimeFormatter.ofPattern("eeee dd MMM hh:mm"));
        System.out.println(localDateTimeString);

        //Exc15
        LocalDate localDate = LocalDate.now();
        LocalTime localTime1 = LocalTime.now();
        LocalDateTime obj = LocalDateTime.of(localDate,localTime1);
        System.out.println(obj);

        //Exc16
        LocalDate localDateObj = obj.toLocalDate();
        LocalTime localTimeObj = obj.toLocalTime();
        System.out.println("localDate: "+ localDateObj + "\nlocalTime: " + localTimeObj);






    }
}
