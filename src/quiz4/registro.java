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
public class registro {
    public void setInfo(corredores[] Corredores) {
        for (int x = 0; x < Corredores.length; x++) {
            JOptionPane.showMessageDialog(null, "Ingrese los datos del participante" +(x+1));
            String Nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del participante:");
            int Edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad del participante:"));
            int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número para identificar al corredor:"));
            Corredores[x] = new corredores(Nombre, Edad, numero);
            
        }
    }
    
    public void prinInfo(corredores[] Corredores) {
        
        String resultado = "";
        for (int i = 0; i < Corredores.length; i++) {
            resultado = Corredores[i].toString() + "\n";
            
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
    
    
}
