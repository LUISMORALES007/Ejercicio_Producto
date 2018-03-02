/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Producto {
    
    String nombre;
    int cantidadInicial;
    int cantidadVendida;
    float precio;
    int cantidad;
         
       
   
    
    
    
    public Producto(String nombre,int cantidadInicial,int cantidadVendida,float precio){
    
        this.nombre= nombre;
        this.cantidadInicial= cantidadInicial;
        this.precio= precio;
        this.cantidadVendida=cantidadVendida;
    
    }

    public Producto(){
    
    }
    
       
    public void comprar(){
    
    
                
                if(this.cantidadInicial<=0){
                
                    System.out.println("Lo sentimos no tenemos de este producto");
                 
                }else{
                
                  this.cantidadInicial=this.cantidadInicial-1;
                  this.cantidadVendida=this.cantidadVendida+1;
                    System.out.println("Usted ha comprado"+this.nombre);
                    System.out.println("____________________________________________");
                    System.out.println("Retire su producto por favor del dispensador");
                    System.out.println("--------------------------------------------");
                }
                
                
                
             
    }
    
    
    
    public void abastecer(){
        
              
                
                Scanner lecturaVar = new Scanner(System.in); 
                
                System.out.println("La cantidad disponible de el producto es "+this.cantidadInicial);
                
                System.out.println("Que cantidad desea adicionar a este producto");
                cantidad =lecturaVar.nextByte();
                
                while(cantidad<=0){
                
                    System.out.println("digite un numero valido");
                     cantidad =lecturaVar.nextByte();
                
                
                }
               this.cantidadInicial=(this.cantidadInicial+ cantidad);
                System.out.println("La nueva cantidad es "+this.cantidadInicial );
                 
                
                
          
    
           
    
          }
    
  
    
                
    
    public void estadisticas(){
    
         System.out.println("--------------------------------------------------------------");
         System.out.println("Producto: "+ this.nombre);
         System.out.println("Precio unitario"+ this.precio);
         System.out.println("cantidad de producto en el inventario"+ this.cantidadInicial);
         System.out.println("cantidad de paquetes vendidos:" + this.cantidadVendida);
         System.out.println("Total ventas: "+ (this.cantidadVendida*this.precio));
         System.out.println("--------------------------------------------------------------");
    
    
    

    
    
    
    }

     
     
}
