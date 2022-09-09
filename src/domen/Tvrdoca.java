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
public class Tvrdoca implements Serializable, OpstiDomenskiObjekat {

    private int TvrdocaID;
    private int StepenTvrdoce;

    public Tvrdoca() {
    }

    public Tvrdoca(int TvrdocaID, int StepenTvrdoce) {
        this.TvrdocaID = TvrdocaID;
        this.StepenTvrdoce = StepenTvrdoce;
    }

    public int getStepenTvrdoce() {
        return StepenTvrdoce;
    }

    public void setStepenTvrdoce(int StepenTvrdoce) {
        this.StepenTvrdoce = StepenTvrdoce;
    }

    public int getTvrdocaID() {
        return TvrdocaID;
    }

    public void setTvrdocaID(int TvrdocaID) {
        this.TvrdocaID = TvrdocaID;
    }

    @Override
    public String toString() {
        switch (StepenTvrdoce) {
            case 1:
                return "Mek";
            case 2:
                return "Srednji";
            default:
                return "Tvrd";
        }
    }

    @Override
    public String vratiNazivTabele() {
        return "tvrdoca";
    }

    @Override
    public String vratiVrednostiAtributa() {
        return TvrdocaID + "," + StepenTvrdoce;
    }

    @Override
    public String vratiNazivID() {
        return "TvrdocaID";
    }

    @Override
    public String vratiNaziveAtributa() {
        return null;
    }

    @Override
    public OpstiDomenskiObjekat napuni(ResultSet rs) {
        try {
            Tvrdoca t = new Tvrdoca(rs.getInt("TvrdocaID"), rs.getInt("StepenTvrdoce"));
            return t;
        } catch (SQLException ex) {
            Logger.getLogger(Tvrdoca.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    @Override
    public String vratiID() {
        return TvrdocaID + "";
    }
    
    @Override
    public String vratiUslovZaUpdate() {
        return "";
    }
}
