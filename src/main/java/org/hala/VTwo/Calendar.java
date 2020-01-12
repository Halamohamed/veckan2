package org.hala.VTwo;

import java.time.*;

public class Calendar {
    private int id;
    private LocalDate localDate;
    private LocalTime localTime;
    private LocalDateTime localDateTime;

    public Calendar(){

        localDate = LocalDate.parse("2018-01-01");
        localTime = LocalTime.parse("00:00");
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public int getId() {
        return id;
    }

    public LocalTime getLocalTime() {
        return localTime;
    }

    public int getDay() {
        return localDate.getDayOfMonth();
    }
    public String getJanuary(){
        return "JANUARY";
    }
    public String getFebruary(){
        return "FEBRUARY";
    }
    public Month getMonth(){
        return localDate.getMonth();
    }
    public int periodOneMonth(){
        return 1;
    }
    public DayOfWeek getDayOfWeek(){
        return localDate.getDayOfWeek();
    }
    public int getYear(){
        return localDate.getYear();
    }

    public static void main(String[] args) {
        Calendar calendar = new Calendar();
        System.out.println(calendar.getYear());
        for (int i=0; i<12; i++){
            if(i==0) System.out.println(calendar.getMonth().plus(i));
            System.out.println("MON\tTUS\tWED\tTHU\tFRI\tSAT\tSUN");

            for (int j=0; j<30; j++){
                System.out.print( j+1 + "\t");
                if(j==6 || j==13 || j==20 || j==27){
                    System.out.println();
                }
                if(j==29){
                    System.out.println("\n" + calendar.getMonth().plus(i+1));
                }
            }

        }
    }
}
