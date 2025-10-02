/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conector;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author 2024105100040018
 */
public class conectar {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/dbProjetoFinal";
    private static final String USER = "root";
    private static final String SENHA = "ipora@123";
    
    public static Connection getConnection(){
        try{
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, SENHA);
        } catch(ClassNotFoundException | SQLException ex){
            throw new RuntimeException("Erro na conexão: ", ex);
        }
    }
    
    public static void closeConnection(Connection con){
        try{
            if(con!=null){
                con.close();
            }
        } catch(SQLException ex){
            Logger.getLogger(conectar.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
    public static void closeConnection(Connection con, PreparedStatement stm){
        try{
            if(stm!=null){
                stm.close();
            }
        } catch(SQLException ex){
            Logger.getLogger(conectar.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
    public static void closeConnection(Connection con, PreparedStatement stm, ResultSet rs){
        try{
            if(rs!=null){
                rs.close();
            }
        } catch(SQLException ex){
            Logger.getLogger(conectar.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
}
