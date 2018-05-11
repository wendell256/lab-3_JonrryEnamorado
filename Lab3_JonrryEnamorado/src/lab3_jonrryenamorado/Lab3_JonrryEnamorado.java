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
    static int d1 = 0;
    static String s1 = "";

    public static void main(String[] args) {
        // TODO code application logic here
        /*int dato;
        Personajes player = new Personajes_Aliados();
        System.out.println("DEV & DUNGEON");
        System.out.println("1) Iniciar");
        System.out.println("2) Nivel de Dificultad");
        System.out.println("3) Salir");
        System.out.println("Seleccione una opción: ");
        int opc = readInt.nextInt();
        switch (opc) {
            case 1:
                System.out.println("1) Mago");
                System.out.println("2) Berzerk");
                System.out.println("3) Picaro");
                System.out.println("4) Arquero");
                System.out.println("Seleccione su clase:");
                int opc2 = readInt.nextInt();
                switch (opc2) {
                    case 1:
                        player = new Mago(d1, d1, d1, d1, d1, d1, d1, s1, d1, s1, d1, d1, s1, s1, s1);
                        break;
                    case 2:
                        player = new Berzerk(d1, d1, d1, d1, d1, d1, d1, s1, d1, s1, d1, d1, s1, s1, s1);
                        break;
                    case 3:
                        player = new Picaro(d1, d1, d1, d1, d1, d1, d1, s1, d1, s1, d1, d1, s1, s1, s1);
                        break;
                    case 4:
                        player = new Arquero(d1, d1, d1, d1, d1, d1, d1, s1, d1, s1, d1, d1, s1, s1, s1);
                        break;
                }//CLASE
                System.out.println("Ingrese el nombre de su personaje:");
                player.setName(readStr.nextLine());
                System.out.println("Ingrese una edad:");
                dato = readInt.nextInt();
                while (dato < 0) {
                    System.out.println("ERROR EDAD NO VALIDA");
                    System.out.println("Ingrese una edad: ");
                    dato = readInt.nextInt();
                }
                player.setEdad(dato);
                

        }//MENU PRINCIPAL*/
        Personajes p = new Bruja(d1, d1, d1, d1, d1, d1, d1, s1, d1, s1, d1, d1, s1, s1, s1);
        System.out.println(p);

    }//MAIN

}//CLASS
