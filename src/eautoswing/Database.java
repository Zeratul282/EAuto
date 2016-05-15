/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eautoswing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import eautoswing.User.UserType;
/**
 *
 * @author Maks
 */
public class Database {
    public static final String DRIVER = "org.sqlite.JDBC";
    public static final String DB_URL = "jdbc:sqlite:users.db";
 
    private Connection conn;
    private Statement stat;
 
    public Database() {
        try {
            Class.forName(Database.DRIVER);
        } catch (ClassNotFoundException e) {
            System.err.println("Brak sterownika JDBC");
            e.printStackTrace();
        }
 
        try {
            conn = DriverManager.getConnection(DB_URL);
            stat = conn.createStatement();
        } catch (SQLException e) {
            System.err.println("Problem z otwarciem polaczenia");
            e.printStackTrace();
        }
 
        createTables();
        System.out.println("Utworzono bazę danych");
    }
 
    public boolean createTables()  {
        String createUsers = "CREATE TABLE IF NOT EXISTS users (imie varchar(255), nazwisko varchar(255), nick varchar(255) PRIMARY KEY, password varchar(255), miasto varchar(255), usertype varchar(20))";
        try {
            stat.execute(createUsers);
        } catch (SQLException e) {
            System.err.println("Blad przy tworzeniu tabeli");
            e.printStackTrace();
            return false;
        }
        return true;
    }
 
    public boolean insertUser(String imie, String nazwisko, String nick, String password, String miasto, UserType usertype) {
        try {
            PreparedStatement prepStmt = conn.prepareStatement(
                    "insert into users values (?, ?, ?, ?, ?, ?);");
            prepStmt.setString(1, imie);
            prepStmt.setString(2, nazwisko);
            prepStmt.setString(3, nick);
            prepStmt.setString(4, password);
            prepStmt.setString(5, miasto);
            prepStmt.setString(6, usertype.toString());
            prepStmt.execute();
        } catch (SQLException e) {
            System.err.println("Blad przy wstawianiu usera");
            e.printStackTrace();
            return false;
        }
        return true;
    }
 
    
    public List<User> selectUsers() {
        List<User> users = new LinkedList<User>();
        try {
            ResultSet result = stat.executeQuery("SELECT * FROM users");
            String imie, nazwisko, nick, password, miasto;
            UserType usertype;
            while(result.next()) {
                imie = result.getString("imie");
                nazwisko = result.getString("nazwisko");
                nick = result.getString("nick");
                password = result.getString("password");
                miasto = result.getString("miasto");
                usertype = result.getObject("usertype", UserType.class);
                users.add(new User(imie, nazwisko, nick, password, miasto, usertype));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return users;
    }
 
    public void closeConnection() {
        try {
            conn.close();
        } catch (SQLException e) {
            System.err.println("Problem z zamknieciem polaczenia");
            e.printStackTrace();
        }
    }
}
