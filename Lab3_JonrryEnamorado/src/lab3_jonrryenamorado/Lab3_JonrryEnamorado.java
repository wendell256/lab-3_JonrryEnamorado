/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_jonrryenamorado;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author wende
 */
public class Lab3_JonrryEnamorado {

    /**
     * @param args the command line arguments
     */
    static int turno = 0;
    static Scanner readInt = new Scanner(System.in);
    static Scanner readStr = new Scanner(System.in);
    static int d1 = 0;
    static String s1 = "";
    static int mapa = 50;
    static int enemigos = 5;
    static Random r = new Random();
    public static void main(String[] args) {
        // TODO code application logic here
        int dato;
        Personajes_Aliados player = new Personajes_Aliados();
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
                while (dato < 1) {
                    System.out.println("ERROR EDAD NO VALIDA");
                    System.out.println("Ingrese una edad: ");
                    dato = readInt.nextInt();
                }
                player.setEdad(dato);
                System.out.println("Ingrese Estatura: ");
                dato = readInt.nextInt();
                while (dato < 1) {
                    System.out.println("ERROR EDAD NO VALIDA");
                    System.out.println("Ingrese una Estatura: ");
                    dato = readInt.nextInt();
                }
                player.setHeight(dato);
                System.out.println("Ingrese Peso: ");
                dato = readInt.nextInt();
                while (dato < 1) {
                    System.out.println("ERROR EDAD NO VALIDA");
                    System.out.println("Ingrese peso: ");
                    dato = readInt.nextInt();
                }
                player.setWeight(dato);
                System.out.println("PELO");
                System.out.println("1) Negro");
                System.out.println("2) Cafe");
                System.out.println("3) Rubio");
                System.out.println("Ingrese una opcion");
                dato = readInt.nextInt();
                switch (dato) {
                    case 1:
                        player.setPelo("Negro");
                        break;
                    case 2:
                        player.setPelo("Cafe");
                        break;
                    case 3:
                        player.setPelo("Rubio");
                        break;
                }//pelo
                System.out.println("PIEL");
                System.out.println("1) Negro");
                System.out.println("2) Cafe");
                System.out.println("3) Rubio");
                System.out.println("Ingrese una opcion");
                dato = readInt.nextInt();
                switch (dato) {
                    case 1:
                        player.setPiel("Negro");
                        break;
                    case 2:
                        player.setPiel("Cafe");
                        break;
                    case 3:
                        player.setPiel("Rubio");
                        break;
                }//piel
                System.out.println("RAZA");
                System.out.println("1) Hobbit");
                System.out.println("2) Elfos");
                System.out.println("3) Humanos");
                System.out.println("4) Enanos");
                dato = readInt.nextInt();
                switch (dato) {
                    case 1:
                        player.setRaza("Hobbit");
                        break;
                    case 2:
                        player.setRaza("Elfo");
                        break;
                    case 3:
                        player.setRaza("Humano");
                        break;
                    case 4:
                        player.setRaza("Enano");
                        break;
                }//raza
                System.out.println("EMPIEZA PARTIDA");
                System.out.println("*TIRA DADO*");
                int dado1 = 1+r.nextInt(20);
                System.out.println("Dado = "+ dado1);
                int dadopartida = 1+r.nextInt(100);
                if(dadopartida < player.getLuck()){
                    System.out.println("HA ENCONTRADO UN OBJETO");
                }
                else if( dadopartida >=95){
                    System.out.println("El calabozo sigue Oscuro pero las criaturas estan cerca...");
                }
                else{
                    if(enemigos!=0){
                        
                    int en = 1+r.nextInt(enemigos);
                    Personajes_Enemigos actual = new Personajes_Enemigos();
                    int verenemigo = 1+r.nextInt(4);
                    switch(verenemigo){
                        case 1:
                            actual = new Bruja();
                            break;
                        case 2:
                            actual = new Troll();
                            break;
                        case 3:
                            actual = new Orco();
                            break;
                        case 4:
                            actual = new Elfo_Oscuro();
                    }
                        System.out.println("TE HAS ENCONTRADO CON CRIATURA " + actual.getName());
                        if(player.getVel()<actual.getVel() || player.getVel() == actual.getVel()){
                            turno = 0;
                        }
                        else{
                            turno = 1;
                            
                        }
                        switch (turno){
                            case 0:
                                System.out.println("Ataca " + actual.getName());
                                
                        }
                        
                        
                    }
                }
                    mapa -= dado1;
                break;

            case 2:
                System.out.println("Dificultad");
                System.out.println("1) Easy");
                System.out.println("2) Kinda Hard");
                System.out.println("3) Survivor");
                System.out.println("Seleccione una opcion:");
                int opc3 = readInt.nextInt();
                switch (opc3) {
                    case 1:
                        mapa = 50;
                        enemigos = 5;
                        break;
                    case 2:
                        mapa = 100;
                        enemigos = 10;
                        break;
                    case 3:
                        mapa = 120;
                        enemigos = 15;
                        break;
                }
        }//MENU PRINCIPAL

    }//MAIN

}//CLASS
