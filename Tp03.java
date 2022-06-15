/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 
 * FABRICIO CARLOS GUIMARAES - CB3014886
 * TP03-LP1I3
 */

package com.mycompany.tp03;
/**
 *
 * @author fabri
 */


public class Tp03 {

    public static void main(String[] args) {
                
                int hora=0;
		int minutos=0;
		int segundos=0;
		
                Hora h = new Hora(hora,minutos,segundos);    
                
                h.setHor();
                h.setMin();
                h.setSeg();
                
               System.out.println("HORA RETORNADA: " + h.getHora1());
               System.out.println("HORA E PERÍODO RETORNADOS: " +h.getHora2());
               System.out.println("TOTAL SEGUNDOS: " + h.getSegundos());
                    
                    
    }

          
}
