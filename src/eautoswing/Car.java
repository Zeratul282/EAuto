/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eautoswing;

/**
 *
 * @author -Zeratul
 * klasa symulująca samochód zapisany do systemu
 */
public class Car {
    /**
     * marka samochodu
     */
    private String mark;
    
    /**
     * rok produkcji
     */
    private Integer year;
    
    /**
     * kraj produkcji
     */
    private String country;
    
    /**
     * ilość przejechanych kilometrów
     */
    private Integer kilometers;
    
    /**
     * ilość miejsc
     */
    private Integer seats;
    
    /**
     * cena
     */
    private Integer price;
    
    /**
     * ilość koni
     */
    private Integer power;
    
    /**
     * pojemność silnika
     */
    private Double capacity;
    
    /**
     * pojemność bagażnika
     */
    private Integer baggageCapacity;
    
    /**
     * wysokość
     */
    private Double height;
    
    /**
     * szerokość
     */
    private Double width;
    
    /**
     * długość
     */
    private Double length;
    
    /**
     * klimatyzacja
     */
    private Boolean conditioning;
    
    /**
     * bluetooth
     */
    private Boolean bluetooth;
    
    /**
     * nawigacja
     */
    private Boolean navigation;
    
    /**
     * wejście USB
     */
    private Boolean usb;
    
    /**
     * Constructor
     * @param mark
     * @param baggageCapacity
     * @param capacity
     * @param country
     * @param height
     * @param length
     * @param width
     * @param kilometers
     * @param power
     * @param seats
     * @param year
     * @param bluetooth
     * @param conditioning
     * @param navigation
     * @param usb 
     */
    public Car(String mark, Integer baggageCapacity, Double capacity,
            String country, Double height, Double length, Double width, 
            Integer kilometers, Integer power, Integer seats, Integer year,
            Boolean bluetooth, Boolean conditioning, Boolean navigation, 
            Boolean usb)
    {
        this.mark=mark;
        this.baggageCapacity=baggageCapacity;
        this.capacity=capacity;
        this.country=country;
        this.height=height;
        this.length=length;
        this.width=width;
        this.kilometers=kilometers;
        this.power=power;
        this.seats=seats;
        this.year=year;
        this.bluetooth=bluetooth;
        this.conditioning=conditioning;
        this.navigation=navigation;
        this.usb=usb;
    }

    /**
     * @return the mark
     */
    public String getMark() {
        return mark;
    }

    /**
     * @param mark the mark to set
     */
    public void setMark(String mark) {
        this.mark = mark;
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
     * @return the kilometers
     */
    public Integer getKilometers() {
        return kilometers;
    }

    /**
     * @param kilometers the kilometers to set
     */
    public void setKilometers(Integer kilometers) {
        this.kilometers = kilometers;
    }

    /**
     * @return the seats
     */
    public Integer getSeats() {
        return seats;
    }

    /**
     * @param seats the seats to set
     */
    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    /**
     * @return the price
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * @return the power
     */
    public Integer getPower() {
        return power;
    }

    /**
     * @param power the power to set
     */
    public void setPower(Integer power) {
        this.power = power;
    }

    /**
     * @return the capacity
     */
    public Double getCapacity() {
        return capacity;
    }

    /**
     * @param capacity the capacity to set
     */
    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

    /**
     * @return the height
     */
    public Double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(Double height) {
        this.height = height;
    }

    /**
     * @return the width
     */
    public Double getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(Double width) {
        this.width = width;
    }

    /**
     * @return the length
     */
    public Double getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(Double length) {
        this.length = length;
    }

    /**
     * @return the conditioning
     */
    public Boolean getConditioning() {
        return conditioning;
    }

    /**
     * @param conditioning the conditioning to set
     */
    public void setConditioning(Boolean conditioning) {
        this.conditioning = conditioning;
    }

    /**
     * @return the navigation
     */
    public Boolean getNavigation() {
        return navigation;
    }

    /**
     * @param navigation the navigation to set
     */
    public void setNavigation(Boolean navigation) {
        this.navigation = navigation;
    }

    /**
     * @return the usb
     */
    public Boolean getUsb() {
        return usb;
    }

    /**
     * @param usb the usb to set
     */
    public void setUsb(Boolean usb) {
        this.usb = usb;
    }

    /**
     * @return the baggageCapacity
     */
    public Integer getBaggageCapacity() {
        return baggageCapacity;
    }

    /**
     * @param baggageCapacity the baggageCapacity to set
     */
    public void setBaggageCapacity(Integer baggageCapacity) {
        this.baggageCapacity = baggageCapacity;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the bluetooth
     */
    public Boolean getBluetooth() {
        return bluetooth;
    }

    /**
     * @param bluetooth the bluetooth to set
     */
    public void setBluetooth(Boolean bluetooth) {
        this.bluetooth = bluetooth;
    }
}
