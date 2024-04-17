package ch.emf.atelierpo.wrk;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 * @author Nilo Perlini
 */
public class Worker {

    /**
     * Description : Cette méthode contrôle le prefix et le numero et retourne une valeur boolean selon le résultat.
     * @param prefix : Les seuls prefix autoriser sont +4176, +4177, +4178, +4179. Si il n'est pas égal à une de ses séquences, la méthode
     * retournera false.
     * @param numero : Le numéro est une séquence de chiffre de 7 numéro au formats suivant : "xxx xx xx". Les seuls caractères autorisé sont
     * les espaces et les chiffres de 0 à 9. Si une de ces conditions n'est pas respectés la méthode retournera false.
     * @return : Retour d'un boolean true ou false si les conditions sont respectés ou non.
     */
    public boolean controleNumeroTelMobile(String prefix, String numero) {
        boolean retour = false;
        ArrayList<String> prefixValides = new ArrayList();
        prefixValides.add("+4176");
        prefixValides.add("+4177");
        prefixValides.add("+4178");
        prefixValides.add("+4179");
        for (String prefixValide : prefixValides) {
            if(prefix == prefixValide){
                retour = true;
            } 
       }
//    Pattern pattern = Pattern.compile("[0-9]{3}\\s[0-9]{2}\\s[0-9]{2}\\s");
//        Matcher matcher = pattern.matcher(numero);
//        boolean numeroValide = matcher.find();
        boolean numeroValide = numero.matches("[0-9]{3}\\s[0-9]{2}\\s[0-9]{2}");
        if(!numeroValide){
            retour = false;
        }
        return retour;
    }

}
