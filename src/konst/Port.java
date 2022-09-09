/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konst;

/**
 *
 * @author Master
 */
public class Port {
    private static Port instance;
    private int port;
    
    private Port() {
       port = 9000;
    }

    public static Port getInstance() {
        if (instance == null) {
            instance = new Port();
        }
        return instance;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
    
}
