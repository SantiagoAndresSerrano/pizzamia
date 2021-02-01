/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

import Modelo.Vo.ComandaVo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author santi
 */
public class ComandaDAO {
       public void guardar(Connection conexion,ComandaVo comanda)throws SQLException{
    
    try{
    PreparedStatement consulta;
    consulta=conexion.prepareStatement("INSERT INTO comanda(Tamanio,Porciones,cSabores,precio,Sabores,nombre,direccion)"+"values(?,?,?,?,?,?,?)");
    
    consulta.setString(1, comanda.getTamanio());
    consulta.setByte(2, comanda.getPorciones());
    consulta.setByte(3, comanda.getcSabores());
    consulta.setInt(4,comanda.getPrecio());
    consulta.setString(5,comanda.getSabores().toUpperCase());
    consulta.setString(6,comanda.getNombre().toUpperCase());
    consulta.setString(7,comanda.getDireccion().toUpperCase());
    consulta.executeUpdate();
    
    
    }catch(SQLException e)
    {
        throw new SQLException(e);
    }
    }
}
