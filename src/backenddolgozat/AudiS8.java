/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backenddolgozat;

/**
 *
 * @author HP
 */
public class AudiS8 extends Jarmu {
    
    protected boolean lezerblokkolo;

    public AudiS8(boolean lezerblokkolo, int sebesseg, String rendszam) {
        super(sebesseg, rendszam);
        this.lezerblokkolo = lezerblokkolo;
    }
    
    

    @Override
    public boolean gyorshajtottE(int sebessegkorlat) {
        if (this.sebesseg > sebessegkorlat && !this.lezerblokkolo) {
            return true;
        }
        else {
            return false;
        }
    }
    
    @Override
    public String toString() {
        return "Audi: " + super.rendszamGetMethod() + " - " + this.sebesseg + " km/h";
    }
    
}
