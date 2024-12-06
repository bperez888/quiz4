/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz4;

import javax.swing.JOptionPane;

/**
 *
 * @author bren
 */
public class corredores {
    private String Nombre = "";
    private int Edad;
    private int numero;
    
    public corredores(String Nombre, int Edad, int numero) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.numero = numero;
        JOptionPane.showMessageDialog(null, "el nombre del corredor es:" + getNombre() + getEdad() + getNumero());
        

    }        

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getEdad() {
        return Edad;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
    
  
    }
    
    
    
    
    
    
 
    
    
   
            
            
 
