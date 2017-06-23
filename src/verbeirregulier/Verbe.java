/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verbeirregulier;

/**
 *
 * @author bonam
 */
public class Verbe {

    private String infinitif;
    private String preterit;
    private String pastPerfect;
    private String francais;

    public Verbe(String vi[]) {

        infinitif = vi[0];
        preterit = vi[1];
        pastPerfect = vi[2];
        francais = vi[3];
    }

     public Verbe(String vi[][],int c) {

        infinitif = vi[0][c];
        preterit = vi[1][c];
        pastPerfect = vi[2][c];
        francais = vi[3][c];
    }

    
    public Verbe(String f, String g, String h, String i) {
        
        infinitif = f;
        preterit = g;
        pastPerfect = h;
        francais = i;

    }

    
    public String getInfinitif(){
    
    return infinitif;
    }
    
      public String getpreterit(){
    
    return preterit;
    }
    
      public String getpastPerfect(){
    
    return pastPerfect;
    }
    
      public String getFrancais(){
    
    return francais;
    }
    
    
      
    
    public boolean equals(Verbe v) {

        return true;

    }

    public boolean equals(String f, String g, String h, String i) {

        return infinitif.equals(f) && preterit.equals(g) && pastPerfect.equals(h) && francais.equals(i);

    }

    
}
