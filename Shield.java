/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shield;


import java.util.logging.Level;
import java.util.logging.Logger;
import org.nmap4j.*;
import org.nmap4j.core.nmap.NMapExecutionException;
import org.nmap4j.core.nmap.NMapInitializationException;
/**
 *
 * @author the-s
 */
public class Shield {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shield s = new Shield();
    }
    
    public Shield(){
        org.nmap4j.Nmap4j n = new org.nmap4j.Nmap4j("nmap -sP 192.168.0.0/24");
        System.out.println("yay");
        
        try {
            n.execute();
        } catch (NMapInitializationException ex) {
            System.out.println(ex + " ex");
        } catch (NMapExecutionException ex) {
            System.out.println(ex + " ex");
        }
    }
    
}
