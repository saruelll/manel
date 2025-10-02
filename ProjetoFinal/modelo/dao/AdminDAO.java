/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import Conector.conectar;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.bean.Admin;
/**
 *
 * @author 2024105100040018
 */
public class AdminDAO {
    public void create(Admin adm){
        Connection con = conectar.getConnection();
        PreparedStatement stm = null;
        
        try {
            stm = con.prepareStatement("INSERT INTO admin(usuario,senha) VALUES(?,?)");
            stm.setString(1, adm.getUsuario());
            stm.setString(2, adm.getSenha());
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
