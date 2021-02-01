/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocrud;

import Modelo.Vo.ComandaVo;
import Modelo.Vo.IngredienteVo;
import Modelo.Vo.TamanioVo;

/**
 *
 * @author santi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//(TamanioVo tamanio, Byte porciones, Byte cSabores, Short precio, String sabor) {
        
        IngredienteVo champiñon = new IngredienteVo("Champiñón",(short)3000);
        
        ComandaVo pedido = new ComandaVo(TamanioVo.GRANDE, (byte) 20, (byte) 3, "champiñones","Santiago","");
        
        System.out.println("PIZZA TAMAÑO "+pedido.getTamanio()+" PORCIONES: "+pedido.getPorciones()+" CANTIDAD DE SABORES: "+pedido.getcSabores());
        System.out.println(pedido.agregarAdicional(champiñon));
        System.out.println(pedido.agregarSabor("Camarones"));
        System.out.println(pedido.agregarSabor("Champiñones"));
        System.out.println(pedido.agregarSabor("Pollo"));
        System.out.println(pedido.agregarSabor("Camarones"));
        
        
        
        
        System.out.println("TOTAL:"+pedido.getPrecio());
        System.out.println(pedido.getSabores());
        System.out.println(pedido.getAdicional());
    }

}
