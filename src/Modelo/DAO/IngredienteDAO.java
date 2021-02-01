/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;


import Modelo.Vo.IngredienteVo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author santi
 */
public class IngredienteDAO {


       public void guardar(Connection conexion,IngredienteVo ingrediente)throws SQLException{
    
    try{
    PreparedStatement consulta;
    consulta=conexion.prepareStatement("INSERT INTO ingrediente()"+"values(?,?)");
    
    consulta.setString(1, ingrediente.getNombre().toUpperCase());
    consulta.setShort(2, ingrediente.getPrecio());


    
    consulta.executeUpdate();
    
    
    }catch(SQLException e)
    {
        throw new SQLException(e);
    }
    }
}

    

