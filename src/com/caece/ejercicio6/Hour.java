package com.caece.ejercicio6;

public class Hour {

    private int hour;
    private int minutes;
    private int seconds;

    Hour() {
        this.hour = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    Hour(int hour, int minutes, int seconds) {
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void getTime() {
        System.out.println(Integer.toString(this.getHour()) + ':' + Integer.toString(this.getMinutes()) + ':'
        + Integer.toString(this.getSeconds()));
    }

    public static Hour sumHours(Hour a, Hour b) {
        Hour result = new Hour();

        result.setHour(a.getHour() + b.getHour());
        result.setMinutes(a.getMinutes() + b.getMinutes());
        result.setSeconds(a.getSeconds() + b.getSeconds());

        return result;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

}
