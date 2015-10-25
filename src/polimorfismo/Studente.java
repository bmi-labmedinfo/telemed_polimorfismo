/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author cristiana
 */
public class Studente extends Persona{
    private String matricola;
    
    public Studente( String nome, String cognome, String matricola) {
        super(nome, cognome);
        this.matricola = matricola;
    }

    @Override
    public String toString() {
        return super.toString() + " matricola=" + matricola;
    }

    public String getMatricola() {
        return matricola;
    }

    @Override
    public String getMail() {
        return nome.toLowerCase().replaceAll(" ", "")+"."+cognome.toLowerCase().replaceAll(" ", "")+"@ateneopv.it";
    }
}
