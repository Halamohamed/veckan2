package org.hala.VTwo;

import java.time.*;

public class Calendar {
    private int id;
    private LocalDate localDate;
    private LocalTime localTime;
    private LocalDateTime localDateTime;

    public Calendar(){

        localDate = LocalDate.now();
        localTime = LocalTime.now();
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
        for (int i=0; i<12; i++){

            if(i==0) System.out.println(calendar.getJanuary());
            System.out.println("MON\tTUS\tWED\tTHU\tFRI\tSAT\tSUN");

            for (int j=0; j<31; j++){
                System.out.print( j+1 + "\t");
                if(j==7 || j==14 || j==21){
                    System.out.println();
                }
                if(j==30){
                    System.out.println(calendar.getMonth().plus(calendar.periodOneMonth()));
                }
            }

        }
    }
}
