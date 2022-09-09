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
 * @author Master
 */
public class Narucen implements Serializable, OpstiDomenskiObjekat {

    private int Kolicina;
    private int dusekID;
    private int porudzbinaID;

    public Narucen() {
    }

    public Narucen(int Kolicina, int dusekID, int porudzbinaID) {
        this.Kolicina = Kolicina;
        this.dusekID = dusekID;
        this.porudzbinaID = porudzbinaID;
    }

    public int getPorudzbina() {
        return porudzbinaID;
    }

    public void setPorudzbina(int porudzbinaID) {
        this.porudzbinaID = porudzbinaID;
    }

    public int getKolicina() {
        return Kolicina;
    }

    public void setKolicina(int Kolicina) {
        this.Kolicina = Kolicina;
    }

    public int getDusek() {
        return dusekID;
    }

    public void setDusek(int dusekID) {
        this.dusekID = dusekID;
    }

    @Override
    public String vratiNazivTabele() {
        return "narucen";
    }

    @Override
    public String vratiVrednostiAtributa() {
        return dusekID + "," + porudzbinaID + "," + Kolicina;
    }

    @Override
    public String vratiNazivID() {
        return null;
    }

    @Override
    public String vratiNaziveAtributa() {
        String str = "";
        return str;
    }

    @Override
    public OpstiDomenskiObjekat napuni(ResultSet rs) {
        try {
            Narucen n = new Narucen(rs.getInt("Kolicina"), rs.getInt("DusekID"), rs.getInt("PorudzbinaID"));
            return n;
        } catch (SQLException ex) {
            Logger.getLogger(Narucen.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    @Override
    public String vratiID() {
        return null;
    }
    
    @Override
    public String vratiUslovZaUpdate() {
        return "PorudzbinaID = " + porudzbinaID;
    }
}
