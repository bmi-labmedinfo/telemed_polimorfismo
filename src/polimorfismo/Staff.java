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
public class Staff extends Persona {
    private String ruolo;

    public Staff(String ruolo, String nome, String cognome) {
        super(nome, cognome);
        this.ruolo = ruolo;
    }

    @Override
    public String getMail() {
        return nome+"."+cognome+"@universitadipavia.it";
    }
}
