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
public class Picaro extends Personajes_Aliados {

    private int hp;
    private int ap;
    private int ad;
    private int eficacia;
    private int crit;
    private int luck;
    private int vel;
    private String shout;

    public Picaro() {
    super ();
    }

    public Picaro(int hp, int ap, int ad, int eficacia, int crit, int luck, int vel, String shout, int edad, String name, int height, int weight, String piel, String pelo, String raza) {
        super(edad, name, height, weight, piel, pelo, raza);
        this.hp = hp;
        this.ap = ap;
        this.ad = ad;
        this.eficacia = eficacia;
        this.crit = crit;
        this.luck = luck;
        this.vel = vel;
        this.shout = shout;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAp() {
        return ap;
    }

    public void setAp(int ap) {
        this.ap = ap;
    }

    public int getAd() {
        return ad;
    }

    public void setAd(int ad) {
        this.ad = ad;
    }

    public int getEficacia() {
        return eficacia;
    }

    public void setEficacia(int eficacia) {
        this.eficacia = eficacia;
    }

    public int getCrit() {
        return crit;
    }

    public void setCrit(int crit) {
        this.crit = crit;
    }

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    public int getVel() {
        return vel;
    }

    public void setVel(int vel) {
        this.vel = vel;
    }

    public String getShout() {
        return shout;
    }

    public void setShout(String shout) {
        this.shout = shout;
    }

    @Override
    public String toString() {
        return "Picaro{" + "hp=" + hp + ", ap=" + ap + ", ad=" + ad + ", eficacia=" + eficacia + ", crit=" + crit + ", luck=" + luck + ", vel=" + vel + ", shout=" + shout + '}';
    }
    
    

}
