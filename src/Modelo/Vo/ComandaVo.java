/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Vo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author santi
 */
public class ComandaVo {

    private TamanioVo tamanio;
    private Byte porciones;
    private Byte cSabores;
    private int precio;
    private List<IngredienteVo> adicional; // Si se elige un adicional
    private List<String> sabores; //Si se eligen mas de un sabor
    private Byte countSabores = 0;
    private String nombre, direccion;

    public ComandaVo() {
    }

    public ComandaVo(TamanioVo tamanio, Byte porciones, Byte cSabores, String sabor, String nombre, String direccion) {

        this.nombre = nombre;
        this.direccion = direccion;
        this.tamanio = tamanio;
        this.porciones = porciones;
        this.cSabores = cSabores;
        this.adicional = new ArrayList<>();
        this.sabores = new ArrayList<>();

        this.calcularPrecio();

    }

    public String agregarAdicional(IngredienteVo adicional) {

        String mensaje;

        this.adicional.add(adicional);
        this.precio += adicional.getPrecio();
        mensaje = "ADICIONAL: " + adicional.getNombre() + "PRECIO:" + adicional.getPrecio() + " AGREGADO CORRECTAMENTE";

        return mensaje;
    }

    public String agregarSabor(String sabor) {
        String mensaje = "";
        if (this.tamanio == TamanioVo.GRANDE) {

            if (countSabores == 3) {
                mensaje = "NO SE PUEDE INGRESAR MAS SABORES";
            } else {
                this.sabores.add(sabor);
                countSabores++;
                mensaje = "SABOR " + sabor + " AGREGADO CORRECTAMENTE, PUEDE AGREGAR " + countSabores + " SABOR(ES) MÁS";
            }

        }
        return mensaje;
    }

    private void calcularPrecio() {
        if (this.tamanio == TamanioVo.GRANDE) {

            this.precio = 24000;
        }
        if (this.tamanio == TamanioVo.MEDIANA) {

            this.precio = 16000;
        }

        if (this.tamanio == TamanioVo.PEQUENIA) {

            this.precio = 11000;
        }

    }

    public String getTamanio() {

        return tamanio.toString();
    }

    public void setTamanio(TamanioVo tamanio) {
        this.tamanio = tamanio;
    }

    public Byte getPorciones() {
        return porciones;
    }

    public void setPorciones(Byte porciones) {
        this.porciones = porciones;
    }

    public Byte getcSabores() {
        return cSabores;
    }

    public void setcSabores(Byte cSabores) {
        this.cSabores = cSabores;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getAdicional() {
        String msg = "";

        for (Byte i = 0; i < this.adicional.size(); i++) {
            if (i == this.sabores.size() - 1) {
                msg += this.adicional.get(i).getNombre();
            } else {
                msg += this.adicional.get(i).getNombre() + ", ";

            }

        }

        return msg;
    }

    public void setAdicional(List<IngredienteVo> adicional) {
        this.adicional = adicional;
    }

    public String getSabores() {
        String msg = "";

        for (Byte i = 0; i < this.sabores.size(); i++) {

            if (i == this.sabores.size() - 1) {
                msg += this.sabores.get(i);
            } else {
                msg += this.sabores.get(i) + ", ";
            }

        }
        return msg;
    }

    public void setSabores(List<String> sabores) {
        this.sabores = sabores;
    }

    public Byte getCountSabores() {
        return countSabores;
    }

    public void setCountSabores(Byte countSabores) {
        this.countSabores = countSabores;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getDireccion() {
        return this.direccion;
    }
    
    
    public void setNombre(String nombre){
    this.nombre = nombre;
    }
    
    public void setDireccion(String direccion){
    this.direccion = direccion;
    }
    
}
