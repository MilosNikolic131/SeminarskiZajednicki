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
import konst.Konstante;
import transfer.KlijentskiZahtev;

/**
 *
 * @author Master
 */
public class Dusek implements Serializable, OpstiDomenskiObjekat {

    private int DusekID;
    private String NazivDuseka;
    private double Cena;
    private int materijalID;
    private int tvrdocaID;

    public Dusek() {
    }

    public Dusek(int DusekID, String NazivDuseka, double Cena, int materijalID, int tvrdocaID) {
        this.DusekID = DusekID;
        this.NazivDuseka = NazivDuseka;
        this.Cena = Cena;
        this.materijalID = materijalID;
        this.tvrdocaID = tvrdocaID;
    }

    public int getTvrdoca() {
        return tvrdocaID;
    }

    public void setTvrdoca(int tvrdocaID) {
        this.tvrdocaID = tvrdocaID;
    }

    public int getDusekID() {
        return DusekID;
    }

    public void setDusekID(int DusekID) {
        this.DusekID = DusekID;
    }

    public String getNazivDuseka() {
        return NazivDuseka;
    }

    public void setNazivDuseka(String NazivDuseka) {
        this.NazivDuseka = NazivDuseka;
    }

    public double getCena() {
        return Cena;
    }

    public void setCena(double Cena) {
        this.Cena = Cena;
    }

    public int getMaterijal() {
        return materijalID;
    }

    public void setMaterijal(int materijalID) {
        this.materijalID = materijalID;
    }

    @Override
    public String toString() {
        return NazivDuseka;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.DusekID;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dusek other = (Dusek) obj;
        if (this.DusekID != other.DusekID) {
            return false;
        }
        return true;
    }

    @Override
    public String vratiNazivTabele() {
        return "dusek";
    }

    @Override
    public String vratiVrednostiAtributa() {
        return DusekID + "," + "\"" + NazivDuseka + "\"" + "," + Cena + "," + materijalID + "," + tvrdocaID;
    }

    @Override
    public String vratiNazivID() {
        return "DusekID";
    }

    @Override
    public String vratiNaziveAtributa() {
        String str = "NazivDuseka = " + "\"" + NazivDuseka + "\"" + ",Cena = " + Cena + ",MaterijalID = " 
                + materijalID + ",TvrdocaID = " + tvrdocaID;
        return str;
    }

    @Override
    public OpstiDomenskiObjekat napuni(ResultSet rs) {
        try {
            Dusek d = new Dusek(rs.getInt("DusekID"), rs.getString("NazivDuseka"), rs.getDouble("Cena"),
                    rs.getInt("MaterijalID"), rs.getInt("TvrdocaID"));
            return d;
        } catch (SQLException ex) {
            Logger.getLogger(Dusek.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public String vratiID() {
        return DusekID + "";
    }
    
    @Override
    public String vratiUslovZaUpdate() {
        return "DusekID = " + DusekID;
    }
    
    
}
