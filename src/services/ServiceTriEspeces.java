package services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import models.EspeceDetail;

public class ServiceTriEspeces implements Comparator<EspeceDetail>{

    /**
     * Trie la listeDesEpspece par ordre alphabétiquer du nom commun, sans modifier
     * l'ordre de la liste passée en paramètre
     * 
     * @param lstEspeceDetails la liste des espèces à trier.
     * 
     * @return une nouvelle liste des espèces triées
     */
    public ArrayList<EspeceDetail> getEspecesTrieesParNomCommun(ArrayList<EspeceDetail> lstEspeceDetails) {
        ArrayList<EspeceDetail> listeTriee = new ArrayList<EspeceDetail>();
        for (EspeceDetail especeDetail : lstEspeceDetails) {
            listeTriee.add(especeDetail);
        }
        Collections.sort(listeTriee);
        return listeTriee;
    }

    /**
     * Trie la listeDesEpspece par ordre alphabétiquer du nom scientifique, sans
     * modifier l'ordre de la liste
     * passée en paramètre
     * 
     * @param lstEspeceDetails la liste des espèces à trier.
     * 
     * @return une nouvelle liste des espèces triées
     */

     public Comparator<EspeceDetail> nomScientifiqueComparator = new Comparator<EspeceDetail>() {

        @Override
        public int compare(EspeceDetail e1, EspeceDetail e2) {
            return e1.getNomScientifique().compareTo(e2.getNomScientifique());
        }
    };
        
    
    public ArrayList<EspeceDetail> getEspecesTrieesParNomScientifique(ArrayList<EspeceDetail> lstEspeceDetails) {
        ArrayList<EspeceDetail> listeTriee = new ArrayList<EspeceDetail>();
        for (EspeceDetail especeDetail : lstEspeceDetails) {
            listeTriee.add(especeDetail);

        }
        Collections.sort(listeTriee, nomScientifiqueComparator);
        
        return listeTriee;
    }
    

    /**
     * Trie la listeDesEpspece par le nombre de ponte. Si le nombre de ponte est
     * égale entre deux espèces, trie alors par la durée de séjour au nid.
     * 
     * @param lstEspeceDetails la liste des espèces à trier.
     * 
     * @return une nouvelle liste des espèces triées
     */

     public Comparator<EspeceDetail> parPonteComparator = new Comparator<EspeceDetail>() {

        @Override
        public int compare(EspeceDetail e1, EspeceDetail e2) {
            return e1.getCaracteristiques().getNombreDePontes().compareTo(e2.getCaracteristiques().getNombreDePontes());
        }
    };
   public ArrayList<EspeceDetail> getEspecesTrieesParPonte(ArrayList<EspeceDetail> lstEspeceDetails) {
    ArrayList<EspeceDetail> listeTriee = new ArrayList<EspeceDetail>();
    for (EspeceDetail especeDetail : lstEspeceDetails) {
        listeTriee.add(especeDetail);
    }
    Collections.sort(listeTriee, parPonteComparator);
    return listeTriee;
}

    @Override
    public int compare(EspeceDetail e1, EspeceDetail e2) {
        return e1.getNomCommun().compareTo(e2.getNomCommun());
    }
    //@Override
    //public int compare2(EspeceDetail e1, EspeceDetail e2) {
    //    return e1.getNomScientifique().compareTo(e2.getNomScientifique());
    //}


}