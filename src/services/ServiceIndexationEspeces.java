package services;

import java.util.ArrayList;

import models.EspeceDetail;

public class ServiceIndexationEspeces {
    private ArrayList<EspeceDetail> listeEspeceDetails;
    private ArrayList<String> listeNomCommun;
    /**
     * Constructeur, initialise les attributs de la classe.
     */
    public ServiceIndexationEspeces() {
        listeEspeceDetails = new ArrayList<EspeceDetail>();
        listeNomCommun = new ArrayList<String>();
    }

    /**
     * Indexe chacune des espèces reçues de manière à ce qu'ensuite la méthode
     * getNomCommuns() puisse faire son travail très rapidement.
     * 
     * @param listEspeceDetails la liste des espèces à indexer
     */
    public void indexerLesEspeces(ArrayList<EspeceDetail> listEspeces) {
  for (EspeceDetail especeDetail : listEspeces) {
    listeEspeceDetails.add(especeDetail);
    listeNomCommun.add(especeDetail.getNomCommun());
  }
    }

    /**
     * Retourne rapidement une nouvelle liste de tous les noms communs des espèces,
     * et ce sans
     * doublos et trié par ordre alphabétique.
     * 
     * @return la liste précitée.
     */
    public ArrayList<String> getlstNomCommun() {
        return listeNomCommun;
    }
}
