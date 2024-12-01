/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_3_captura;

import java.util.Scanner;

/**
 *
 * @author flac3
 */
public class EVA3_3_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     String nombre = capturaTexto("Intruduce tu nombre");
     String apellido = capturaTexto("Intruduce tu apellido");
     int edad = edadPersona("Intruduce tu edad");
     System.err.println("Nombre:"+nombre);
     System.err.println("apellido:"+apellido);
     System.err.println("Edad:"+edad);
    }
    public static String capturaTexto(String mensaje){
    Scanner captu = new Scanner(System.in);
    
    String nombre;
    System.out.println(mensaje);
    nombre = captu. nextLine();
    return nombre;
    }
    public static int edadPersona (int edad){
      Scanner captu = new Scanner(System.in);
      
      int edad1;
      edad1 = captu.nextInt();
      return edad1;
    
    }
  public static double capturarDouble(int edad){
      Scanner captu = new Scanner(System.in);
      
      int salario1;
      salario1 = captu.nextInt();
      return salario1;
}
}