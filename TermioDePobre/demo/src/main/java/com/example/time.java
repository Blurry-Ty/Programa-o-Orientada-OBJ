package com.example;

public class time {
    private int hour, minute, second;

    public time(int minute, int second){
        
        //this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public time(String currentTime){
        String[] time = currentTime.split(":");
        //hour = Integer.parseInt(time[0]);
        minute = Integer.parseInt(time[0]);
        second = Integer.parseInt(time[1]);
    }
    public String getCurrentTime(){
        return minute + ":" + second;
    }

    public void oneSecondPassed(){
        second++;
        if(second == 60){
            minute++;
            second=0;
            if(minute == 60){
                hour++;
                minute=0;
            }if(hour == 24){
                hour = 0;
                System.out.println("NextDay");
            }
        }
    }



}
