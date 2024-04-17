package ch.emf.atelierpo.wrk;

/**
 *
 * @author Mario Ramalho(EMF - Fribourg)
 */
public class Worker {

   /**
    * Cette méthode vérifie que la valeur du paramètre rentrée pour le canton est valide, puis elle vérifie si la valeur du paramètre rentrée pour le numéro de plaque est valide
    * @param canton Pour être valide, ce paramètre doit contenir 2 lettres majuscule uniquement, aucun numéro ou caractère spécial
    * @param numeroDePlaque Pour être valide, ce paramètre doit contenir 1 à 6 chiffres entiers uniquement, aucune lettre ou aucun caractère spécial
    * @return cette méthode booléenne doit retourner false si le canton ou le numéro de plaque n'est pas valide, et true seulement si les deux sont strictement valides
    */
    public boolean controlePlaqueImmatriculation(String canton, String numeroDePlaque) {
        return false;
    }

}
