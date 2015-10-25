/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author cristiana
 */
public class TestAnagrafica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p[] = new Persona[10];
        p[0] = new Teacher("Mario", "Rossi", "Informatica");
        p[1] = new Studente("Antonio", "Bianchi", "12345");

        p[2] = new Studente("Pippo", "Verdi", "12225");
        p[3] = new Teacher("Luigi", "Gialli", "Fisica");
        p[4] = new Studente("Andrea", "Verdi", "12325");
        p[5] = new Studente("Luigi", "Gialli", "947555");
        p[6] = new Teacher("Marco", "Viola", "Fisica");
        Anagrafica an = new Anagrafica("Pavia", p);
        System.out.println(an);
        System.out.println("\nnumero persone " + an.numero());
        an.gruppi();
        Studente cs = an.cercaStudente("947555");
        System.out.println(cs != null ? "\n" + cs : "\nNessuno studente");

        cs = an.cercaStudente("94755");
        System.out.println(cs != null ? "\n" + cs : "\nNessuno studente");
        System.out.println("\n");
        
        for (Teacher s : an.cercaDocente("Fisica")) {
            if (s == null) {
                break;
            }
            System.out.println(s);
        }
    }
}
