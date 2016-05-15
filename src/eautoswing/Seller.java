/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eautoswing;

import java.util.ArrayList;

/**
 *
 * @author -Zeratul
 */
public class Seller extends User{
    /**
     * lista samochodów do sprzedania
     */
    private ArrayList<Car> carList;

    /**
     * Constructor
     * @param nick
     * @param password 
     */
    public Seller(String nick, String password)
    {
        super(nick, password);
        this.setUsertype(User.UserType.SELLER);
    }
    
    /**
     * setter for list of cars
     * @param car 
     */
    public void addCar(Car car)
    {
        this.carList.add(car);
    }
    
    /**
     * getter for list of cars
     * @param index
     * @return needed Car
     */
    public Car getCar(int index)
    {
        return this.carList.get(index);
    }
}
