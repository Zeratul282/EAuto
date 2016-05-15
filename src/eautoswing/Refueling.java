/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eautoswing;

/**
 *
 * @author -Zeratul
 */
public class Refueling {
    /**
     * fuel's type
     */
    private FuelType fuel;
    
    /**
     * amount of fuel in this refueling
     */
    private Integer amount;
    
    public Refueling(FuelType fuel, Integer amount)
    {
        this.fuel=fuel;
        this.amount=amount;
    }

    /**
     * @return the fuel
     */
    public FuelType getFuel() {
        return fuel;
    }

    /**
     * @param fuel the fuel to set
     */
    public void setFuel(FuelType fuel) {
        this.fuel = fuel;
    }

    /**
     * @return the amount
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }
    
    /**
     * enum for fuel's type
     */
    public enum FuelType
    {
        PETROL95,PETROL98,GAS,DIESEL;
    }
}
