/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocrud;

import Control.Negocio;
import Modelo.Vo.ComandaVo;
import Modelo.Vo.PizzaVo;
import Vista.Comanda;
import Vista.FormularioP;
import Vista.ModificarPizza;
import Vista.RegistroIngrediente;
import Vista.RegistroPizza;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author santi
 */
public class ProyectoCrud {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        try {
            ComandaVo comanda = new ComandaVo();
            Comanda registroC = new Comanda();
            FormularioP principal = new FormularioP();
            RegistroPizza registroP = new RegistroPizza();
            ModificarPizza modificarP = new ModificarPizza();
            RegistroIngrediente registroI = new RegistroIngrediente();
            
            Negocio negocio = new Negocio( registroC, principal,  registroP,  modificarP,  registroI);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProyectoCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
}
