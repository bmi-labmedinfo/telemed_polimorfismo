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
public class Anagrafica {

    private Persona[] people;
    private String nomeUniversita;

    public Anagrafica(String nome, Persona[] people) {
        this.nomeUniversita = nome;
        this.people = people;
    }

    @Override
    public String toString() {
        String s = "Universita di " + nomeUniversita + "\n";
        for (Persona p : people) {
            if (p == null) {
                break;
            }
            s += p + " mail: " + p.getMail() + "\n";
        }
        return s;
    }

    public int numero() {
        int n = 0;
        for (Persona p : people) {
            if (p == null) {
                break;
            }
            n++;
        }
        return n;
    }

    public void gruppi() {
        int nS = 0, nT = 0;
        for (Persona p : people) {
            if (p == null) {
                break;
            }
            if (p instanceof Studente) {
                nS++;
            } else if (p instanceof Teacher) {
                nT++;
            }
        }
        System.out.println(nS + " studenti");
        System.out.println(nT + " docenti");
    }

    public Studente cercaStudente(String matr) {
        Studente s;
        for (Persona p : people) {
            if (p == null) {
                break;
            }
            if (p instanceof Studente) {
                s = (Studente) p;
                if (s.getMatricola().equals(matr)) {
                    return s;
                }
            }
        }
        return null;
    }
    
    public Teacher[] cercaDocente(String materia) {
        Teacher t[] = new Teacher[10], el;
        int n=0;
        for (Persona p : people) {
            if (p == null) {
                break;
            }
            if (p instanceof Teacher) {
                el = (Teacher) p;
                if (el.getCorso().equals(materia)) {
                    t[n++]=el;
                }
            }
        }
        return t;
    }
}
