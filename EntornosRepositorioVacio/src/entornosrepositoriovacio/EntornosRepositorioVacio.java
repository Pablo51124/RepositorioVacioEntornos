/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entornosrepositoriovacio;
import java.util.*;
/**
 *
 * @author admin
 */
public class EntornosRepositorioVacio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cont = 0;
        String cadena;
        char caracter, letra;
        
        System.out.println("Introduzca una cadena");
        cadena = sc. nextLine();
        System.out.println("Introduce un caracter");
        caracter = sc.nextLine().charAt(0);
        
        for(int i = 0; i <cadena.length() ; i++){
            letra = cadena.charAt(i);
            if(letra == caracter){
                cont++;
            }
        }
        
        System.out.println("El caracter " + caracter + " se ha repetido " + cont + " veces");
        
    }
    
}
