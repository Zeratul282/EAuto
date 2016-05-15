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
public class NormalUser extends User{
    /**
     * lista samochodów
     */
    private ArrayList<Car> carList;
    
    /**
     * exception to trying to lower kilometers of your car
     */
    public class LowerKilometers extends Exception
    {
        
    }
    
    /**
     * Constructor
     * @param nick
     * @param password 
     */
    public NormalUser(String nick, String password)
    {
        super(nick, password);
        this.setUsertype(User.UserType.NORMALUSER);
    }
    
    /**
     * function for updating your car's kilometers
     * @param index - index in your cars' list
     * @param newValue - new value of kilometers for that car
     * @throws eautoswing.NormalUser.LowerKilometers  - new exception
     */
    public void changeKilometers(int index, Integer newValue) throws LowerKilometers
    {
        if(newValue>this.carList.get(index).getKilometers())
        {
            this.getCar(index).setKilometers(newValue);
        }
        else
        {
            throw new LowerKilometers();
        }
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
