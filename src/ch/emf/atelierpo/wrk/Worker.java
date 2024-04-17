package ch.emf.atelierpo.wrk;

/**
 *
 * @author Mario Ramalho(EMF - Fribourg)
 */

public class Worker {
    
    private final int LONGUEUR_CANTON = 2;
    private final int LONGEUR_MIN_NUMERO = 1;
    private final int LONGEUR_MAX_NUMERO = 6;
    
   /**
    * Cette méthode vérifie que la valeur du paramètre rentrée pour le canton est valide, puis elle vérifie si la valeur du paramètre rentrée pour le numéro de plaque est valide
    * @param canton Pour être valide, ce paramètre doit contenir 2 lettres majuscule uniquement, aucun numéro ou caractère spécial
    * @param numeroDePlaque Pour être valide, ce paramètre doit contenir 1 à 6 chiffres entiers uniquement, aucune lettre ou aucun caractère spécial
    * @return cette méthode booléenne doit retourner false si le canton ou le numéro de plaque n'est pas valide, et true seulement si les deux sont strictement valides
    */
    public boolean controlePlaqueImmatriculation(String canton, String numeroDePlaque) {
        
        //création et implémentation des variable local
        boolean controle = true;
        String abreviationCanton = canton;
        String numPlaque = numeroDePlaque;
        
        //contrôle que la longueur du string ne dépasse pas 2
        if(abreviationCanton.length() != LONGUEUR_CANTON){
            
            //retourne false
           controle = false;
           
        } else {
            
            //contrôle que ls string est égal à lui même en majuscule
            if(!abreviationCanton.equals(abreviationCanton.toUpperCase())){
                
                //retourne false
                controle = false;
            }
        }
        
        //contrôle que la longueur du numéro soit correct
        if(numPlaque.length() < LONGEUR_MIN_NUMERO || numPlaque.length() > LONGEUR_MAX_NUMERO){
            
            //retourne false
            controle = false;
        }else{
            
            //contrôle que la plaque ne contiennent pas de lettre
            for (char c : numPlaque.toCharArray()) {
                
                if(Character.isLetter(c)){
                    
                    controle = false;
                    break;
                }
            }
        }
        
        
        return controle;
    }

}
