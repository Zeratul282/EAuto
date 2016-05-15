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
public class Mechanic extends User{
    /**
     * lista wizyt
     */
    private ArrayList<Visit> visitList;
    
    /**
     * Constructor
     * @param nick
     * @param password 
     */
    public Mechanic(String nick, String password)
    {
        super(nick, password);
        this.setUsertype(User.UserType.MECHANIC);
    }
    
    /**
     * setter dla wizyty
     * @param visit 
     */
    public void addVisit(Visit visit)
    {
        this.visitList.add(visit);
    }
    
    /**
     * getter dla wizyty
     * @param index
     * @return potrzebna wizyta
     */
    public Visit getVisit(int index)
    {
        return this.visitList.get(index);
    }
}
