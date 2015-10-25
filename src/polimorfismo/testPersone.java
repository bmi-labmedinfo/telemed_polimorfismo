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
public class testPersone {
    public static void main(String[] args) {
        Studente s = new Studente("Mario Antonio", "De Rossi", "1111");
        System.out.println("s = " + s);
        System.out.println(s.getMail());
        
        Teacher t = new Teacher("Giovanni Maria", "Bianchi", "analisi");
        System.out.println("\nt = " + t);
        System.out.println(t.getMail());
        
        Staff st = new Staff("Valentina", "Verdi", "manager didattico");
        System.out.println("\nst = " + st);
        System.out.println(st.getMail());
        
    }
}
