/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.io.Serializable;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Master
 */
public class Dimenzije implements Serializable, OpstiDomenskiObjekat {

    private int VelicinaID;
    private int DusekID;

    public Dimenzije() {
    }

    public Dimenzije(int VelicinaID, int DusekID) {
        this.VelicinaID = VelicinaID;
        this.DusekID = DusekID;
    }

    public int getDusekID() {
        return DusekID;
    }

    public void setDusekID(int DusekID) {
        this.DusekID = DusekID;
    }

    public int getVelicinaID() {
        return VelicinaID;
    }

    public void setVelicinaID(int VelicinaID) {
        this.VelicinaID = VelicinaID;
    }

    @Override
    public String vratiNazivTabele() {
        return "dimenzije";
    }

    @Override
    public String vratiVrednostiAtributa() {
        return VelicinaID + "," + DusekID;
    }

    @Override
    public String vratiNazivID() {
        return null;
    }

    @Override
    public String vratiNaziveAtributa() {
        String str = "VelicinaID = " + VelicinaID;
        return str;
    }

    @Override
    public OpstiDomenskiObjekat napuni(ResultSet rs) {
        return null;
    }

    @Override
    public String vratiID() {
        return null;
    }

    @Override
    public String vratiUslovZaUpdate() {
        return "DusekID = " + DusekID;
    }


}
