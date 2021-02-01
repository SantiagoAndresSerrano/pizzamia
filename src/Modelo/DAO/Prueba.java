/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

import Modelo.Vo.ComandaVo;
import Modelo.Vo.IngredienteVo;
import Modelo.Vo.PizzaVo;
import Modelo.Vo.TamanioVo;
import java.sql.SQLException;

/**
 *
 * @author santi
 */
public class Prueba {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
       ComandaDAO comandao = new ComandaDAO();
      // ComandaVo comandavo = new ComandaVo(TamanioVo.GRANDE,(byte)3,(byte)2,"Pollo con queso","santiago","Ceiba");
//(TamanioVo tamanio, Byte porciones, Byte cSabores, String sabor) {

      // comandao.guardar(Conexion.obtener(), comandavo);
       
//       
//       PizzaVo pizza = new PizzaVo("Pollo,camarones,pulpo","Pollo con camarones");
//       PizzaDAO pizzao = new PizzaDAO();
//       pizzao.guardar(Conexion.obtener(),pizza);
       
//       IngredienteVo ingrediente = new IngredienteVo("Bocadillo",(short)3000);
//       IngredienteDAO ingredienteao = new IngredienteDAO();
//       ingredienteao.guardar(Conexion.obtener(), ingrediente);
       
       
       
       IngredienteVo ingrediente2 = new IngredienteVo("Jamon",(short)3300);
       IngredienteDAO ingredienteao2 = new IngredienteDAO();
       ingredienteao2.guardar(Conexion.obtener(), ingrediente2);
       
       
       IngredienteVo ingrediente3 = new IngredienteVo("Pollo",(short)2000);
       IngredienteDAO ingredienteao3 = new IngredienteDAO();
       ingredienteao3.guardar(Conexion.obtener(), ingrediente3);
       
    }
    
}
