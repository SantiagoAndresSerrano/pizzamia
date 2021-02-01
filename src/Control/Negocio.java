/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.Vo.ComandaVo;
import Modelo.Vo.PizzaVo;
import Vista.Comanda;
import Vista.FormularioP;
import Vista.ModificarPizza;
import Vista.RegistroIngrediente;
import Vista.RegistroPizza;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author santi
 */
public class Negocio implements ActionListener{
    
    ComandaVo comanda;
    Comanda registroC;
    FormularioP principal;
    RegistroPizza registroP;
    ModificarPizza modificarP;
    RegistroIngrediente registroI;

    List<PizzaVo> pizza;

    public Negocio(Comanda registroC, FormularioP principal, RegistroPizza registroP, ModificarPizza modificarP, RegistroIngrediente registroI) {
        super();
        this.registroC = registroC;
        this.principal = principal;
        this.registroP = registroP;
        this.modificarP = modificarP;
        this.registroI = registroI;
        this.pizza = pizza;
        actionListener(this);
        principal.setVisible(true);
    }

    private void actionListener(ActionListener a) {
     
     principal.comandabtn.addActionListener(a);
     
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
      if(ae.getSource()  == principal.ModificarP){
      
          ModificarPizza modificar = new ModificarPizza();
          modificar.setVisible(true);
          
      }
        
        if(ae.getSource() == principal.comandabtn){
            
          try {
              Comanda c = new Comanda();
              c.setVisible(true);
          } catch (SQLException | ClassNotFoundException ex) {
              Logger.getLogger(Negocio.class.getName()).log(Level.SEVERE, null, ex);
          }
        
            
        
        }
        
    }
    
    
}
