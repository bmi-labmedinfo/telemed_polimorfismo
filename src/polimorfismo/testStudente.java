/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author cristiana
 */
public class testStudente {
    public static void main(String[] args) {
        Studente s = new Studente("Mario Antonio", "De Rossi", "1111");
        System.out.println("s = " + s);
        System.out.println(s.getMail());
        
    }
}
