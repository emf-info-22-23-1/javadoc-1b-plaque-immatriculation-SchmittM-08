package ch.emf.atelierpo;

import ch.emf.atelierpo.wrk.Worker;

/**
 *
 * @author Mario Ramalho(EMF - Fribourg)
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Worker wrk = new Worker();
        
        if (wrk.controlePlaqueImmatriculation(null, "123$89023~")) {
            System.out.println("IMMATRICULATION OK");
        } else {
            System.out.println("IMMATRICULATION NOK");
        }

    }

}
