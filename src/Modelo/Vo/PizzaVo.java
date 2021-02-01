/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Vo;

/**
 *
 * @author santi
 */
public class PizzaVo {

    private String sabor;
    private String ingredientes;

    

    public PizzaVo(String ingredientes, String sabor){
    this.sabor = sabor;
    this.ingredientes = ingredientes;
    }
    
    public String getIngredientes() {
        return ingredientes;
    }
    
    public String getSabor(){
    return this.sabor;
    }
    
    public void setSabor(String sabor){
    this.sabor= sabor;
    }
    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }





   
    
    
    
    
}
