/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eautoswing;


/**
 *
 * @author Mike @ Maks @ Zbyszek
 * klasa symulująca użytkownika zalogowanego do aplikacji, jego parametry są wypełniane podczas pobierania z bazy danych
 * <br>
 * userType to enum mający 3 możliwości
 */
public class User {
    /**
     * imię użytkownika
     */
    private String imie;
    /**
     * nazwisko użytkownika
     */
    private String nazwisko;
    /**
     * nick użytkownika, sprawdzany z loginem
     */
    private String nick;
    /**
     * hasło użytkownika, porównywane z tym w bazie
     */
    private String password;
    /**
     *miasto użytkownika
     */
    private String miasto;
    /**
     * typ użytkownika, enum mający 3 możliwości, pobierany z bazy
     */
    private UserType usertype;    
    
    public User(String nick, String password)
    {
        this.nick=nick;
        this.password=password;
    }

    /**
     * @return the imie
     */
    public String getImie() {
        return imie;
    }

    /**
     * @param imie the imie to set
     */
    public void setImie(String imie) {
        this.imie = imie;
    }

    /**
     * @return the nazwisko
     */
    public String getNazwisko() {
        return nazwisko;
    }

    /**
     * @param nazwisko the nazwisko to set
     */
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    /**
     * @return the miasto
     */
    public String getMiasto() {
        return miasto;
    }

    /**
     * @param miasto the miasto to set
     */
    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    /**
     * @return the usertype
     */
    public UserType getUsertype() {
        return usertype;
    }

    /**
     * @param usertype the usertype to set
     */
    public void setUsertype(UserType usertype) {
        this.usertype = usertype;
    }

    /**
     * @return the nick
     */
    public String getNick() {
        return nick;
    }

    /**
     * @param nick the nick to set
     */
    public void setNick(String nick) {
        this.nick = nick;
    }

  
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }
    
    /**
     * enum for user's type
     */
    public enum UserType{
        MECHANIC,NORMALUSER,SELLER;
    }
}
