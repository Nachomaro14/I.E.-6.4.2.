package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {
    
    java.sql.Connection o;
    
    private String url = "jdbc:oracle:thin:@localhost:1521:XE";
    private String user = "SYSTEM";
    private String password = "root";
    
    public java.sql.Connection getConexion(){
        try{
            o = DriverManager.getConnection(url, user, password);
        }catch(SQLException ex){
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this.o;
    }
    
    public void closeConnection(){
        try{
            this.o.close();
        }catch(SQLException ex){
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}