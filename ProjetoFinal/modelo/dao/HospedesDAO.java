/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;

import Conector.conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.bean.Hospedes;

/**
 *
 * @author 2024105100040018
 */
public class HospedesDAO {
    public void create(Hospedes h){
        Connection con = conectar.getConnection();
        PreparedStatement stm = null;
        
        try {
            stm = con.prepareStatement("INSERT INTO hospedes(nome,cpf,telefone) VALUES(?,?,?)");
            stm.setString(1, h.getNome());
            stm.setString(2, h.getCpf());
            stm.setString(3, h.getTelefone());
            
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
