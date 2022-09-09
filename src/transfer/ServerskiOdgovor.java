/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transfer;

import java.io.Serializable;

/**
 *
 * @author Master
 */
public class ServerskiOdgovor implements Serializable {

    private String poruka;
    private Object parametar;

    public ServerskiOdgovor(String poruka, Object parametar) {
        this.poruka = poruka;
        this.parametar = parametar;
    }

    public ServerskiOdgovor() {
    }

    public String getPoruka() {
        return poruka;
    }

    public void setPoruka(String poruka) {
        this.poruka = poruka;
    }

    public Object getParametar() {
        return parametar;
    }

    public void setParametar(Object parametar) {
        this.parametar = parametar;
    }

}
