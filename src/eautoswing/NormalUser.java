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
     * Constructor
     * @param nick
     * @param password 
     */
    public NormalUser(String nick, String password)
    {
        super(nick, password);
        this.setUsertype(User.UserType.NORMALUSER);
    }
}
