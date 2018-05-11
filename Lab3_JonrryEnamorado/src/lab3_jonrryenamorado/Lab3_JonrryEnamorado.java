/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_jonrryenamorado;

import java.util.Scanner;

/**
 *
 * @author wende
 */
public class Lab3_JonrryEnamorado {

    /**
     * @param args the command line arguments
     */
    static Scanner readInt = new Scanner(System.in);
    static Scanner readStr = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        /*System.out.println("DEV & DUNGEON");
        System.out.println("1) Iniciar");
        System.out.println("2) Nivel de Dificultad");
        System.out.println("3) Salir");
        System.out.println("Seleccione una opción: ");
        int opc = readInt.nextInt();*/
        
        Personajes_Aliados pa = new Personajes_Aliados();
        pa = new Mago();
        
    }
    
}
