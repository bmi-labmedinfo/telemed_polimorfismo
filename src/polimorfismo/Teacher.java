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
public class Teacher extends Persona {

    private String corso;
    
    public Teacher(String nome, String cognome, String corso) {
        super(nome, cognome);
        this.corso = corso;
    }

    @Override
    public String toString() {
        return super.toString() + " corso=" + corso;
    }

    public String getCorso() {
        return corso;
    }

    @Override
    public String getMail() {
        return nome.toLowerCase().replaceAll(" ", "")+"."+cognome.toLowerCase().replaceAll(" ", "")+"@unipv.it";
    }
}
