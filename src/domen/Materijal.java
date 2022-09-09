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
public class Materijal implements Serializable, OpstiDomenskiObjekat {

    private int MaterijalID;
    private String NazivMaterijala;

    public Materijal() {
    }

    public Materijal(int MaterijalID, String NazivMaterijala) {
        this.MaterijalID = MaterijalID;
        this.NazivMaterijala = NazivMaterijala;
    }

    public String getNazivMaterijala() {
        return NazivMaterijala;
    }

    public void setNazivMaterijala(String NazivMaterijala) {
        this.NazivMaterijala = NazivMaterijala;
    }

    public int getMaterijalID() {
        return MaterijalID;
    }

    public void setMaterijalID(int MaterijalID) {
        this.MaterijalID = MaterijalID;
    }

    @Override
    public String toString() {
        return NazivMaterijala;
    }

    @Override
    public String vratiNazivTabele() {
        return "materijal";
    }

    @Override
    public String vratiVrednostiAtributa() {
        return MaterijalID + "," + "\"" + NazivMaterijala + "\"" ;
    }

    @Override
    public String vratiNazivID() {
        return "MaterijalID";
    }

    @Override
    public String vratiNaziveAtributa() {
        String str = "NazivMaterijala = " + NazivMaterijala;
        return str;
    }

    @Override
    public OpstiDomenskiObjekat napuni(ResultSet rs) {
        System.out.println("IZVRSAVAM>>>");
        if(rs == null){
            System.out.println("NULL");
            return null;
        }
        System.out.println(rs);
        try {
            Materijal m = new Materijal(rs.getInt("MaterijalID"), rs.getString("NazivMaterijala"));
            return m;
        } catch (SQLException ex) {
            Logger.getLogger(Dusek.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    @Override
    public String vratiID() {
        return MaterijalID + "";
    }
    
    @Override
    public String vratiUslovZaUpdate() {
        return "";
    }
}
