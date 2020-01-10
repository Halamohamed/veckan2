package org.hala.VTwo;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TimeAPI {
    public static void main(String[] args) {
        //Exc1
        LocalDate today = LocalDate.now();
        System.out.println("1: today is: "+today);

        //Exc2
        LocalDate march29 = LocalDate.parse("2018-03-29");
        String todayPattern = march29.format(DateTimeFormatter.ofPattern("eeee dd MMM"));

        System.out.println("2: thursday: " + todayPattern);

        //Exc3
        LocalDate localDate1 = LocalDate.now();
        LocalDate lMonday = localDate1.minus(Period.ofDays(1));

        System.out.println("3: last monday: " + lMonday.getDayOfWeek() + lMonday);

        //Exc4
        LocalDate january7 = LocalDate.parse("2020-01-07");

        System.out.println("4: " + january7);

        //Exc5
        LocalDate may5 = LocalDate.of(1945,05,8);
        DayOfWeek dayOfWeek = may5.getDayOfWeek();
        System.out.println("5: day of week: " + dayOfWeek + " day of month: "+ may5.getDayOfMonth());

        //Exc6
        LocalDate todayPlus10 = today.plus(Period.ofYears(10).minus(Period.ofMonths(10)));
        System.out.println("6: " + todayPlus10);
        System.out.println("the month is: " + todayPlus10.getDayOfMonth());

        //Exc7
        LocalDate birthdate = LocalDate.of(1985,12,24);
        Period period = Period.between(birthdate,todayPlus10);

        System.out.println("7: Period b/n birthDate and todayPlus10: is leap year: " + birthdate.isLeapYear() + ", months " + period.getMonths() + ", days " + period.getDays());

        //Exc8
        Period period1 = Period.ofYears(4).plus(Period.ofMonths(7)).plus(Period.ofDays(29));
        LocalDate currentDay = LocalDate.now().plus(period1);
        //System.out.println(today);
        System.out.println("8: current day"+  today+" + 4years + 7months + 29days: " + currentDay);

        //Exc9
        LocalTime localTime = LocalTime.now();
        System.out.println("9: local time: " + localTime);

        //Exc10
        int nanoSeconds = localTime.getNano();
        System.out.println("10: nano seconds of a local time: " + nanoSeconds);

        //Exc11
        LocalTime localTimeString = LocalTime.parse("09:50");
        System.out.println("11: local time using parse: " + localTimeString);

        //Exc12
        String formatTime = localTime.format(DateTimeFormatter.ISO_LOCAL_TIME);
        //System.out.println(formatTime);
        System.out.println("12: using DateTimeFormatter  - " + localTime.truncatedTo(ChronoUnit.SECONDS));

        //Exc13
        LocalDateTime localDateTime = LocalDateTime.of(2018,04,05,10,00);
        String fifthApril = localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        String clock10 = localDateTime.format(DateTimeFormatter.ofPattern("hh:mm"));
        System.out.println("13: creating LocalDateTime. date: " + fifthApril + ", time: " + clock10);

        //Exc14
        String localDateTimeString = localDateTime.format(DateTimeFormatter.ofPattern("eeee dd MMM hh:mm"));
        System.out.println("14: LocalDateTime using DateTimeFormatter: " + localDateTimeString);

        //Exc15
        LocalDate localDate = LocalDate.now();
        LocalTime localTime1 = LocalTime.now();
        LocalDateTime obj = LocalDateTime.of(localDate,localTime1);
        System.out.println("15: combining localDate object and localTime object: " + obj);

        //Exc16
        LocalDate localDateObj = obj.toLocalDate();
        LocalTime localTimeObj = obj.toLocalTime();
        System.out.println("16: getting the localDate and localTime from the LocalDateTime object: \nlocalDate: "+ localDateObj + "\nlocalTime: " + localTimeObj);






    }
}
