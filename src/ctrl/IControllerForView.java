package ctrl;

import java.time.LocalDate;
import java.util.ArrayList;

import models.Observation;


public interface IControllerForView {

    void actionQuitter();

    /**
      actionIndexerEspeces
     */
    void actionIndexerEspeces();
    
    /**
     * Trie la listeDesEspeces par NomCommun. Affiche la liste des espèces dans la vue.
     */
    void actionTriParNomCommun();
    
    /**
     * Trie la liste des espèces par nom scientifique et affiche la liste des espèces dans la vue.
     */
    void actionTriParNomScientifique();
    
    /**
     * Trie la liste des espèces par le nombre de ponte et par durée de séjour au nid, affiche la liste des
     * espèces dans la vue.
     * Si le nombre de ponte est égal entre deux  espèces, trie alors par la durée de séjour au nid.
     */
    void actionTriParPonte();
    
    /**
     * Retourne très rapidement la liste des noms communs de toutes les espèces.
     */
    ArrayList<String> getlstNomCommun();
    
    /**
     * Indexe toutes les observations existantes.
     */
    void actionIndexerObservations();
    
    /**
     * Affiche la liste de toutes les observations dans la vue.
     */
    void actionChargerObservations();
    
    /**
     * Affiche dans la vue la liste des observations concernant le nomCommun passé en paramètre.
     */
    void actionChargerObservationsParEspece(String nomCommun);
    
    /**
     * Affiche dans la vue la liste des observations effectuées à la date passée en paramètre.
     */
    void actionChargerObservationParDate(LocalDate date);
    
    /**
     * Affiche dans la vue la liste des observations concernant le nomCommun passé en paramètre et effectuées à la date passée en paramètre.
     */
    void actionChargerObservationsParEspeceEtDate(String nomCommun, LocalDate date);
    
    /**
     * Ajoute une observation et indexe cette observation.
     */
    void actionAjouterObservation(Observation observation);

}
    