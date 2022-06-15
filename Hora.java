/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 
 
 * FABRICIO CARLOS GUIMARAES - CB3014886
 * TP03-LP1I3
 */
package com.mycompany.tp03;
import java.text.NumberFormat;
import java.util.Scanner;



/**
 *
 * @author fabri
 */
public class Hora {

        private int hora;
	private int min;
	private int seg;
        
        public Hora(){
   
       }
       public Hora(int h, int m, int s){
       
           hora = h;
           min = m;
           seg = s;

       }
               
               //Digitação e Validação da hora
               public void setHor(){
        
                int hor = 0;
                Scanner scan= new Scanner(System.in); 
		while(hor>23 | hor <1){		
		System.out.println("Digite a hora:  ");
		hor = scan.nextInt();  
                setHor(hor);
                    
                                        }
        }
               //Digitação e Validação do minutos
                public void setMin(){

                int minutos = 0;
                Scanner scan= new Scanner(System.in); 
                
		while(minutos<1 | minutos>59){
		System.out.println("Digite os minutos:  ");
		minutos = scan.nextInt();
                setMin(minutos);
                    }
                }
                
            //Digitação e Validação dos segundos     
                public void setSeg(){
 
                int segundos = 0;
                Scanner scan= new Scanner(System.in); 
                
		while(segundos<1 | segundos>59){
		System.out.println("Digite os segundos:  ");
		segundos = scan.nextInt();
                setSeg(segundos);
                    
                    }
               }
               
                public void setHor(int h){
        
                hora = h;
         
                 }
        
                public void  setMin(int m){

                 min = m;

                }
        
                public void setSeg(int s){

                seg = s;

                }
        
        public void Hor(){
        
        
        }
        
        public void Min(){
        
        }
        
        public void Seg(){
        
        }
        
        public int getHora(){

        return hora;
        }
         public int getMin(){
        
        return min;
        }
        public int getSeg(){
        
        return seg;
        }
        
        public String getHora1(){
            
                      
            String h ="";
            String m ="";
            String s ="";
            
           if(hora<10){
              h = "0" + NumberFormat.getInstance().format(hora);             
            }else{
              h=NumberFormat.getInstance().format(hora);}
            
            if(min<10){
              m =  "0" + NumberFormat.getInstance().format(min) ;             
            }else{
              m=NumberFormat.getInstance().format(min);
            }
            
            if(seg<10){
              s = "0" + NumberFormat.getInstance().format(seg);             
            }else{
              s=NumberFormat.getInstance().format(seg);
            }

            String horario = h+":" + m + ":" + s;
            
            return horario;
            
        }
        
        public String getHora2(){
            
          
               String periodo="";
               
                if(hora>=12){
                periodo = " PM";}
                else{
                periodo = " AM";}
               
              return getHora1() + periodo;
        
        }
        public int getSegundos(){
            
           int totalSeg = 0;
           int h;
           int m;
           int s;
           
           h = hora*3600;
           m = min*60;
           s = seg;
           
           totalSeg = h + m + s;
           
           return totalSeg;
           
            
            
            
        }

    private String toString(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
   
