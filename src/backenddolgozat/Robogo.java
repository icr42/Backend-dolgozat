/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backenddolgozat;

/**
 *
 * @author HP
 */
public class Robogo extends Jarmu implements KisGepjarmu{
    
    protected int maximalis_sebesseg;

    public Robogo(int maximalis_sebesseg, int sebesseg, String rendszam) {
        super(sebesseg, rendszam);
        this.maximalis_sebesseg = maximalis_sebesseg;
    }

    
    @Override
    public boolean haladhatItt(int szam) {
        if (maximalis_sebesseg > szam) {
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public boolean gyorshajtottE(int sebessegkorlat) {
        if (sebessegkorlat < this.sebesseg) {
            return true;
        }
        else {
            return false;
        }
    }
    
}
