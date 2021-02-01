/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;


import Modelo.Vo.PizzaVo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author santi
 */
public class PizzaDAO {


       public void guardar(Connection conexion,PizzaVo pizza)throws SQLException{
    
    try{
    PreparedStatement consulta;
    consulta=conexion.prepareStatement("INSERT INTO pizza(Sabor,ingredientes)"+"values(?,?)");
    
    consulta.setString(1, pizza.getSabor().toUpperCase());
    consulta.setString(2, pizza.getIngredientes().toUpperCase());

    
    consulta.executeUpdate();
    
    
    }catch(SQLException e)
    {
        throw new SQLException(e);
    }
    }
}

    

