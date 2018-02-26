/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoohandlung;

/**
 *
 * @author t.ladenburger
 */
public class Ente extends Tier implements Fliegen, Laufen, Schwimmen {
    int anzahlBeine;

    @Override
    public void laufe() {
        System.out.println("Ich laufe!");
    }

    @Override
    public int getAnzahlBeine() {
       return anzahlBeine;
    }

    @Override
    public void setAnzahlBeine(int anzahl) {
        this.anzahlBeine = anzahlBeine;
    }

    @Override
    public void schwimme() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
