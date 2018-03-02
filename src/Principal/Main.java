
package Principal;

import java.util.Scanner;


/**
 *
 * @author lenovo
 */
public class Main {
    
      

     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Producto papas = new Producto("Papas",10,0,1_500); 
        Producto galletas = new Producto("Galletas",12,0,900);
        Producto chitos = new Producto("chitos",7,0,1_000);
        Producto choco = new Producto("chocoramo",4,0,1_800);
       
        
        Scanner lecturaVar= new Scanner(System.in);
        byte opcionMenu;
        
        do{//repeticion del menu de ejercicios
    
        System.out.println("Ejercicio Dispensador de Productos");
        System.out.println("1.Para comprar un producto.");
        System.out.println("2.Para abastecer productos.");
        System.out.println("3.Estadisticas");
        System.out.println("4.Finalizar.");
        System.out.println("Digite el numero de la opcion que desea: ");
        
        opcionMenu = lecturaVar.nextByte();//escaneo del dato del menu del usuario
        switch(opcionMenu){
            
            case 1:
               
                                            
        
                                                    do{//repeticion del menu de ejercicios
    
                                                      System.out.println("COMPRAR PRODUCTOS");
                                                      System.out.println("-----------------");
                                                      System.out.println("1. Papas Margarita.");
                                                      System.out.println("2. Galletas.");
                                                      System.out.println("3. Chitos.");
                                                      System.out.println("4. Chocorramo");
                                                      System.out.println("5. Volver al panel principal ");
                                                      System.out.println("Digite el numero del producto que desea comprar ");
        
                                                      opcionMenu = lecturaVar.nextByte();//escaneo del dato del menu del usuario
                                                      switch(opcionMenu){
            
                                                      case 1:
                                                           
                                                            papas.comprar();
            
                                                               break;
            
                                                      case 2:
                                                            
                                                            galletas.comprar();
           
               
                                                                break;
               
                                                       case 3:
                                                              
                                                              chitos.comprar();
           
                
                                                                break;
               
                                                        case 4:
                                                               
                                                               choco.comprar();
           
               
                                                                 break;
               
                                                         case 5:
               
                                                          System.out.println("<<=");
                                                                 break;
                                                                                        
                                                         default:
                                                                                                         
                                                             System.out.println("La opcion no es valida.");
                                                             break;
                                                             }
        
                                                        }while(opcionMenu!=5);
               
                
                         break;
            
            case 2:                                           
                
                
                                                                             do{//repeticion del menu de ejercicios
    
                                                      System.out.println("ABASTECER PRODUCTOS");
                                                      System.out.println("-----------------");
                                                      System.out.println("1. Papas Margarita.");
                                                      System.out.println("2. Galletas.");
                                                      System.out.println("3. Chitos.");
                                                      System.out.println("4. Chocorramo");
                                                      System.out.println("5. Volver al panel principal ");
                                                      System.out.println("Digite el numero del producto que desea abastecer ");
        
                                                      opcionMenu = lecturaVar.nextByte();//escaneo del dato del menu del usuario
                                                      switch(opcionMenu){
            
                                                      case 1:
                                                            System.out.println("PAPAS");
                                                            papas.abastecer();
            
                                                               break;
            
                                                      case 2:
                                                            System.out.println("GALLETAS");
                                                            galletas.abastecer();
           
               
                                                                break;
               
                                                       case 3:
                                                              System.out.println("CHITOS");
                                                              chitos.abastecer();
           
                
                                                                break;
               
                                                        case 4:
                                                               System.out.println("CHOCORAMO");
                                                               choco.abastecer();
           
               
                                                                 break;
               
                                                         case 5:
               
                                                          System.out.println("<<=");
                                                                 break;
                                                                                        
                                                         default:
                                                                                                         
                                                             System.out.println("La opcion no es valida.");
                                                             break;
                                                             }
        
                                                        }while(opcionMenu!=5);
              
           
               
               break;
               
            case 3:
                
                System.out.println("Las estadisticas de los productos son:");
                papas.estadisticas();
                galletas.estadisticas();
                chitos.estadisticas();
                choco.estadisticas();
                
                
                break;
               
            case 4:
                //salida del menu.
                System.out.println("Ha Finalizado.");
              
                break;
            default:
                //opcion no valida del menu.
                System.out.println("La opcion no es valida.");
                break;
        }
        
        }while(opcionMenu!=4);
    
    
  }
    
   
    
    
    
}
