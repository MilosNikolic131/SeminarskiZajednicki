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

public class Velicina implements Serializable, OpstiDomenskiObjekat {

    private int VelicinaID;
    private double Visina;
    private double Duzina;
    private double Sirina;

    public Velicina() {
    }

    public Velicina(int VelicinaID, double Visina, double Duzina, double Sirina) {
        this.VelicinaID = VelicinaID;
        this.Visina = Visina;
        this.Duzina = Duzina;
        this.Sirina = Sirina;
    }

    public double getSirina() {
        return Sirina;
    }

    public void setSirina(double Sirina) {
        this.Sirina = Sirina;
    }

    public int getVelicinaID() {
        return VelicinaID;
    }

    public void setVelicinaID(int VelicinaID) {
        this.VelicinaID = VelicinaID;
    }

    public double getVisina() {
        return Visina;
    }

    public void setVisina(double Visina) {
        this.Visina = Visina;
    }

    public double getDuzina() {
        return Duzina;
    }

    public void setDuzina(double Duzina) {
        this.Duzina = Duzina;
    }

    @Override
    public String toString() {
        return "Visina=" + Visina + ", Duzina=" + Duzina + ", Sirina=" + Sirina;
    }

    @Override
    public String vratiNazivTabele() {
        return "velicina";
    }

    @Override
    public String vratiVrednostiAtributa() {
        return VelicinaID + "," + Visina + "," + Sirina + "," + Duzina;
    }

    @Override
    public String vratiNazivID() {
        return "VelicinaID";
    }

    @Override
    public String vratiNaziveAtributa() {
        return null;
    }
    
    @Override
    public OpstiDomenskiObjekat napuni(ResultSet rs) {
        try {
            Velicina v = new Velicina(rs.getInt("VelicinaID"), rs.getInt("Visina"), rs.getInt("Sirina"), rs.getInt("Duzina"));
            return v;
        } catch (SQLException ex) {
            Logger.getLogger(Tvrdoca.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    @Override
    public String vratiID() {
        return VelicinaID + "";
    }
    
    @Override
    public String vratiUslovZaUpdate() {
        return "";
    }
}
