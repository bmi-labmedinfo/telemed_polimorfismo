/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author cristiana
 */
public abstract class Persona {

    protected String nome;
    protected String cognome;
    
    public Persona(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public abstract String getMail();

    @Override
    public String toString() {
        return  nome + " " + cognome ;
    }

}
