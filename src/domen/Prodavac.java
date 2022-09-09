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
public class Prodavac implements Serializable, OpstiDomenskiObjekat {

    private String KorisnickoIme;
    private String Lozinka;

    public Prodavac() {
    }

    public Prodavac(String KorisnickoIme, String Lozinka) {
        this.KorisnickoIme = KorisnickoIme;
        this.Lozinka = Lozinka;
    }

    public String getLozinka() {
        return Lozinka;
    }

    public void setLozinka(String Lozinka) {
        this.Lozinka = Lozinka;
    }

    public String getKorisnickoIme() {
        return KorisnickoIme;
    }

    public void setKorisnickoIme(String KorisnickoIme) {
        this.KorisnickoIme = KorisnickoIme;
    }

    @Override
    public String toString() {
        return "Korisnicko Ime: " + KorisnickoIme + " Lozinka: " + Lozinka;
    }

    @Override
    public String vratiNazivTabele() {
        return "prodavac";
    }

    @Override
    public String vratiVrednostiAtributa() {
        return KorisnickoIme + "," + Lozinka;
    }

    @Override
    public String vratiNazivID() {
        return null;
    }

    @Override
    public String vratiNaziveAtributa() {
        return null;
    }
@Override
    public OpstiDomenskiObjekat napuni(ResultSet rs) {
        try {
           Prodavac p = new Prodavac(rs.getString("KorisnickoIme"), rs.getString("Lozinka"));
            return p;
        } catch (SQLException ex) {
            Logger.getLogger(Dusek.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    @Override
    public String vratiID() {
        return null;
    }
    
    @Override
    public String vratiUslovZaUpdate() {
        return "";
    }
}
