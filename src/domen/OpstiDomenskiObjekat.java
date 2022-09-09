/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.sql.ResultSet;

/**
 *
 * @author Master
 */
public interface OpstiDomenskiObjekat {

    public abstract String vratiNazivTabele();

    public abstract String vratiVrednostiAtributa();

    public abstract String vratiNazivID();

    public abstract String vratiNaziveAtributa();

    public abstract OpstiDomenskiObjekat napuni(ResultSet rs);

    public abstract String vratiID();

    public abstract String vratiUslovZaUpdate();

}
