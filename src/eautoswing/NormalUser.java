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
     * exception for trying to lower kilometers of your car
     */
    public class LowerKilometers extends Exception
    {
        
    }
    
    /**
     * exception for trying to add non-existent car
     */
    public class NoCar extends Exception
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
        this.carList=new ArrayList<>();
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
    public void addCar(Car car) throws NoCar
    {
        if(car==null)
        {
            throw new NoCar();
        }
        else
        {
            this.carList.add(car);
        }
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
