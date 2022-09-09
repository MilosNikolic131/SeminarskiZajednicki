/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DusanIMilos
 */
public class Porudzbina implements Serializable, OpstiDomenskiObjekat {

    private int PorudzbinaID;
    private String ImePrezime;
    private String Adresa;
    private String Napomena;
    private double Ukupno;

    public Porudzbina() {
    }

    public Porudzbina(int PorudzbinaID, String ImePrezime, String Adresa, String Napomena, double Ukupno) {
        this.PorudzbinaID = PorudzbinaID;
        this.ImePrezime = ImePrezime;
        this.Adresa = Adresa;
        this.Napomena = Napomena;
        this.Ukupno = Ukupno;
    }

    public double getUkupno() {
        return Ukupno;
    }

    public void setUkupno(double Ukupno) {
        this.Ukupno = Ukupno;
    }

    public int getPorudzbinaID() {
        return PorudzbinaID;
    }

    public void setPorudzbinaID(int PorudzbinaID) {
        this.PorudzbinaID = PorudzbinaID;
    }

    public String getImePrezime() {
        return ImePrezime;
    }

    public void setImePrezime(String ImePrezime) {
        this.ImePrezime = ImePrezime;
    }

    public String getAdresa() {
        return Adresa;
    }

    public void setAdresa(String Adresa) {
        this.Adresa = Adresa;
    }

    public String getNapomena() {
        return Napomena;
    }

    public void setNapomena(String Napomena) {
        this.Napomena = Napomena;
    }

    @Override
    public String toString() {
        return "Porudzbina: " + " ImePrezime: " + ImePrezime + " Adresa: " + Adresa + " Ukupno: " + Ukupno;
    }

    @Override
    public String vratiNazivTabele() {
        return "porudzbina";
    }

    @Override
    public String vratiVrednostiAtributa() {
        return PorudzbinaID + "," + "\"" + ImePrezime + "\"" + "," + "\"" + Adresa + "\"" + "," + "\"" + Napomena + "\"" + "," + Ukupno;
    }

    @Override
    public String vratiNazivID() {
        return "PorudzbinaID";
    }

    @Override
    public String vratiNaziveAtributa() {
        return null;
    }

    @Override
    public OpstiDomenskiObjekat napuni(ResultSet rs) {
        try {
            Porudzbina p = new Porudzbina(rs.getInt("PorudzbinaID"), rs.getString("ImePrezime"), rs.getString("Adresa"), rs.getString("Napomena"), rs.getDouble("Ukupno"));
            return p;
        } catch (SQLException ex) {
            Logger.getLogger(Tvrdoca.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    @Override
    public String vratiID() {
        return PorudzbinaID + "";
    }
    
    @Override
    public String vratiUslovZaUpdate() {
        return "";
    }
}
