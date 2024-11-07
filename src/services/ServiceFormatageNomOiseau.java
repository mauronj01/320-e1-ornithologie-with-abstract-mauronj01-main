package services;

public class ServiceFormatageNomOiseau {

    /**
     * 
     * @param nomOiseau en deux mots avec un espace.
     * @return String ou "entrée incorrecte" si le paramètre ne contient rien ou pas
     *         d'espace
     * 
     *         Cette méthode permet de formatter le nom d'un oiseau donné en
     *         paramètre.
     *         Elle permet de retourner le nom de l'oiseau en nminuscule.
     *         Le nom de l'oiseau étant donnée avec un espace, cette methode le
     *         remplace aussi par un "_"
     * 
     */

    public static String formatterNomOiseau(String nomOiseau) {
        String res = "entrée incorrecte";
        if (nomOiseau.contains(" ") && !nomOiseau.equals(null)) {
            res = nomOiseau.toLowerCase().replace(" ", "_");
        }
        return res;
    }
}
