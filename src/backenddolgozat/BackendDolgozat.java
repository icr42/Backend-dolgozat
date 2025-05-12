/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package backenddolgozat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class BackendDolgozat {
    
    /**
     * @param args the command line arguments
     */
    private static List <Jarmu> jarmuvek = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        
        jarmuvekJonnek("adatok.txt");
        kikitMertunkBe();
    }
    
    public static void jarmuvekJonnek(String fajlnev) {
        try (BufferedReader br = new BufferedReader(new FileReader(fajlnev))) {
            String sor;
            while ((sor = br.readLine()) != null) {
                String[] adatok = sor.replace("\"", "").split(";");
                
                if (adatok[0].equals("robogo")) {
                    int max_sebesseg = adatok[1].isEmpty() ? 50 : Integer.parseInt(adatok[1]);
                    Robogo robogo = new Robogo(max_sebesseg, Integer.parseInt(adatok[2]), "");
                    jarmuvek.add(robogo);
                } else if (adatok[0].equals("audi")) {
                    AudiS8 audi = new AudiS8(Boolean.parseBoolean(adatok[3]), Integer.parseInt(adatok[2]), adatok[1]);
                    jarmuvek.add(audi);
                }
            }
        } 
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static void kikitMertunkBe() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("buntetes.txt"))) {
            for (Jarmu jarmu : jarmuvek) {
                boolean gyorsHajt = jarmu.gyorshajtottE(90);
                
                writer.write(jarmu.toString());
                writer.write(" - " + (gyorsHajt ? "true" : "false"));
                writer.newLine();
            }
        } 
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    }
