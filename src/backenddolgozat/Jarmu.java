/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backenddolgozat;

/**
 *
 * @author HP
 */
public abstract class Jarmu {
    protected int sebesseg;
    private String rendszam;

    public Jarmu(int sebesseg, String rendszam) {
        this.sebesseg = sebesseg;
        this.rendszam = rendszam;
    }
    
    public String rendszamGetMethod() {
        return this.rendszam;
    }
    
    public abstract boolean gyorshajtottE(int sebessegkorlat);
}
