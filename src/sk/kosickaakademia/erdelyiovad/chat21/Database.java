package sk.kosickaakademia.erdelyiovad.chat21;

import sk.kosickaakademia.erdelyiovad.chat21.Connect;
import sk.kosickaakademia.erdelyiovad.chat21.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.List;


public class Database {
    private String url = "jdbc:mysql://itsovy.sk:3306/chat2021";
    private String username = "mysqluser";
    private String password = "Kosice2021!";
    private final String insertNewUser = "INSERT INTO user (login, password) VALUES (?,?)";
    private final String loginUser = "Select * FROM user Where login LIKE ? and password LIKE ?";
    private final String newMessage = "INSERT INTO message( frto, to, text) VALUES (?,?,?)";

    private Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
}

    public boolean sendMessage(int from, String toUser, String content){
        if(text==null || text.equals(""))
            return false;
        int to = getUserId(toUser);
        if(to==-1)
            return false;
        try {
            Connection con = getConnection();
            if(con ==null){
                System.out.println("Connection problem!");
                return false;
            }
    }
