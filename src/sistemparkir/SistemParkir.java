/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemparkir;

/**
 *
 * @author FarrellPC
 */
public class SistemParkir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        User u = new User();
        //cara ngakses inner class 
        User.Kuota k = u.new Kuota();
        
    }
    
}
