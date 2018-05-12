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
    
    static String cont = "";
    static int turno = 0;
    static Scanner readInt = new Scanner(System.in);
    static Scanner readStr = new Scanner(System.in);
    static int d1 = 0;
    static String s1 = "";
    static int mapa = 50;
    static int enemigos = 5;
    static Random r = new Random();
    static String[] objects = {"Talisman", "Gun", "Armadura"};

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
        while (opc < 3) {
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
                        default:
                            System.out.println("TE QUIERES PASAR DE LISTO? YO ELEGIRE TU CLASE");
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
                    while (player.getHp() > 0 && mapa > 0) {
                        System.out.println("*TIRA DADO*");
                        int dado1 = 1 + r.nextInt(20);
                        System.out.println("Dado = " + dado1);
                        int dadopartida = 1 + r.nextInt(100);
                        if (dadopartida < player.getLuck()) {
                            System.out.println("------------------------");
                            System.out.println("HA ENCONTRADO UN OBJETO");
                            int obj = 0 + r.nextInt(3);
                            System.out.println("Has encontrado " + objects[obj-1]);
                            switch (objects[obj]) {
                                case "Talisman":
                                    System.out.println("SUERTE AUMENTADA");
                                    player.setLuck(player.getLuck() + 1);
                                    break;
                                case "Gun":
                                    System.out.println("ATAQUE AUMENTADO");
                                    player.setAp(player.getAp() + 10);
                                    break;
                                case "Armadura":
                                    System.out.println("HP AUMENTADO");
                                    player.setHp(player.getHp() + 15);
                            }
                        } else if (dadopartida >= 95) {
                            System.out.println("------------------------");
                            System.out.println("El calabozo sigue Oscuro pero las criaturas estan cerca...");
                        } else {
                            if (enemigos != 0) {

                                Personajes_Enemigos actual = new Bruja(d1, d1, d1, d1, d1, d1, d1, s1, d1, s1, d1, d1);

                                int verenemigo = 1 + r.nextInt(4);
                                switch (verenemigo) {
                                    case 1:
                                        actual = new Bruja(d1, d1, d1, d1, d1, d1, d1, s1, d1, s1, d1, d1);
                                        break;
                                    case 2:
                                        actual = new Troll(d1, d1, d1, d1, d1, d1, d1, s1, d1, s1, d1, d1);
                                        break;
                                    case 3:
                                        actual = new Orco(d1, d1, d1, d1, d1, d1, d1, s1, d1, s1, d1, d1);
                                        break;
                                    case 4:
                                        actual = new Elfo_Oscuro(d1, d1, d1, d1, d1, d1, d1, s1, d1, s1, d1, d1);
                                        break;
                                    default:
                                        actual = new Bruja(d1, d1, d1, d1, d1, d1, d1, s1, d1, s1, d1, d1);
                                }
                                System.out.println("TE HAS ENCONTRADO CON CRIATURA " + actual.getName());
                                if (player.getVel() < actual.getVel() || player.getVel() == actual.getVel()) {
                                    turno = 0;
                                } else {
                                    turno = 1;

                                }
                                System.out.println(actual.getHp());
                                System.out.println(player.getHp());
                                while (player.getHp() > 0 && actual.getHp() > 0) {
                                    switch (turno) {
                                        case 0:
                                            System.out.println("------------------------");
                                            System.out.println("Presione una tecla para continuar");
                                            readStr.nextLine();
                                            System.out.println(actual.getShout());
                                            System.out.println("Ataca " + actual.getName());
                                            if (eficacia(actual.getEficacia())) {
                                                int atene = actual.getAd() + actual.getAp();
                                                System.out.println("Ataque efectivo");
                                                if (critico(actual.getCrit())) {
                                                    System.out.println("ATAQUE CRITICO");
                                                    atene *= 2;

                                                }
                                                System.out.println("Daño = " + atene);
                                                player.setHp(player.getHp() - atene);
                                            } else {
                                                System.out.println("Ataque no efectivo");
                                            }
                                            turno = 1;
                                            break;
                                        case 1:
                                            System.out.println("------------------------");
                                            System.out.println("Presione una tecla para continuar");
                                            readStr.nextLine();
                                            System.out.println(player.getShout());
                                            System.out.println("Ataca " + player.getName());
                                            if (eficacia(player.getEficacia())) {
                                                int atyou = player.getAd() + player.getAp();
                                                System.out.println("Ataque efectivo");
                                                if (critico(player.getCrit())) {
                                                    System.out.println("ATAQUE CRITICO");
                                                    atyou *= 2;
                                                }
                                                System.out.println("Daño = " + atyou);
                                                actual.setHp(actual.getHp() - atyou);
                                            } else {
                                                System.out.println("Ataque no efectivo");
                                            }
                                            turno = 0;
                                            break;

                                    }
                                    System.out.println("HP " + actual.getName() + " = " + actual.getHp());
                                    System.out.println("HP " + player.getName() + " = " + player.getHp());
                                    if (actual.getHp() <= 0) {
                                        System.out.println("------------------------");
                                        System.out.println("HA ENCONTRADO UN OBJETO");
                                        int obj = 0 + r.nextInt(3);
                                        System.out.println("Has encontrado " + objects[obj-1]);
                                        switch (objects[obj]) {
                                            case "Talisman":
                                                System.out.println("SUERTE AUMENTADA");
                                                player.setLuck(player.getLuck() + 1);
                                                break;
                                            case "Gun":
                                                System.out.println("ATAQUE AUMENTADO");
                                                player.setAp(player.getAp() + 10);
                                                break;
                                            case "Armadura":
                                                System.out.println("HP AUMENTADO");
                                                player.setHp(player.getHp() + 15);
                                                break;
                                        }
                                    }
                                }
                                enemigos -= 1;
                            } else {
                                System.out.println("------------------------");
                                System.out.println("Parece que las criaturas se han fugado...");
                            }
                        }
                        mapa -= dado1;
                    }
                    if (mapa < 0) {
                        System.out.println("FELICIDADES TERMINASTE EL CALABOZO");

                    } else if (player.getHp() < 0) {
                        System.out.println("HAS MUERTO");
                    }
                    enemigos = 5;
                    mapa = 50;
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
            }
        }//MENU PRINCIPAL
    }//MAIN

    static boolean eficacia(int l) {
        int dado = 1 + r.nextInt(100);

        if (dado < l) {
            return true;
        }
        return false;
    }

    static boolean critico(int l) {
        int dado = 1 + r.nextInt(100);

        if (dado < l) {
            return true;
        }
        return false;

    }
}//CLASS
