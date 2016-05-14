/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eautoswing;

/**
 *
 * @author -Zeratul
 * klasa symulująca wizytę u mechanika
 */
public class Visit {
    /**
     * dzień
     */
    private Integer day;
    
    /**
     * miesiąc
     */
    private Integer month;
    
    /**
     * rok
     */
    private Integer year;
    
    /**
     * godzina
     */
    private Integer hour;
    
    /**
     * minuta
     */
    private Integer minute;
    
    /**
     * samochód będący przedmiotem wizyty
     */
    private Car car;

    /**
     * @return the day
     */
    public Integer getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(Integer day) {
        this.day = day;
    }

    /**
     * @return the month
     */
    public Integer getMonth() {
        return month;
    }
    
    /**
     * constructor
     * @param day
     * @param month
     * @param year
     * @param hour
     * @param minute 
     */
    public Visit(Integer day, Integer month, Integer year, Integer hour, Integer minute)
    {
        this.day=day;
        this.month=month;
        this.year=year;
        this.hour=hour;
        this.minute=minute;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(Integer month) {
        this.month = month;
    }

    /**
     * @return the year
     */
    public Integer getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(Integer year) {
        this.year = year;
    }

    /**
     * @return the hour
     */
    public Integer getHour() {
        return hour;
    }

    /**
     * @param hour the hour to set
     */
    public void setHour(Integer hour) {
        this.hour = hour;
    }

    /**
     * @return the minute
     */
    public Integer getMinute() {
        return minute;
    }

    /**
     * @param minute the minute to set
     */
    public void setMinute(Integer minute) {
        this.minute = minute;
    }

    /**
     * @return the car
     */
    public Car getCar() {
        return car;
    }

    /**
     * @param car the car to set
     */
    public void setCar(Car car) {
        this.car = car;
    }
}
