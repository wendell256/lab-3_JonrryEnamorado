/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_jonrryenamorado;

/**
 *
 * @author wende
 */
public class Mago extends Personajes_Aliados {

    public Mago() {
    super();
    }


    

    public Mago(int hp, int ap, int ad, int eficacia, int crit, int luck, int vel, String shout, int edad, String name, int height, int weight, String piel, String pelo, String raza) {
        super(120, 50, 20, 70, 2, 20, 10, "TE HARE DESAPARECER", edad, name, height, weight, piel, pelo, raza);
    }

}
