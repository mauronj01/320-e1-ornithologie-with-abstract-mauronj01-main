package services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import models.Observation;

public class ServiceIndexationObservations {
    private HashMap<String, ArrayList<Observation>> hashObservationParNomCommun;
    private HashMap<LocalDate, ArrayList<Observation>> hashObservationParDate;
    private HashMap<String, HashMap<LocalDate, ArrayList<Observation>>> hashObservationDateEtNom;

    /**
     * Constructeur, initialise les attributs de la classe.
     */
    public ServiceIndexationObservations() {

        hashObservationParNomCommun = new HashMap<String, ArrayList<Observation>>();
        hashObservationParDate = new HashMap<LocalDate, ArrayList<Observation>>();
        hashObservationDateEtNom = new HashMap<String, HashMap<LocalDate, ArrayList<Observation>>>();
    }
/**
 * 
 * @param listObservations
 */
    /**
     * Indexe la liste des observations afin que les observations puissent être
     * retrouvées très rapidement, ceci par nom commun, par date, et par nom commun
     * et date.
     * 
     * Cette méthode appelle la méthode indexerObservation pour toutes les
     * observations de la liste passée en paramètre.
     * 
     * @param listObservations la liste des observations à indexer
     */
    public void indexerObservations(ArrayList<Observation> listObservations) {
        for (Observation observation : listObservations) {
            indexerObservation(observation);
        }

    }

    /**
     * Indexe l'observation fournie afin que cette observation puisse être retrouvée
     * très rapidement, ceci par nom commun, par date, et par nom commun et date.
     * 
     * @param observation l'observation à indexer
     */
    public void indexerObservation(Observation observation) {

        if (!hashObservationParNomCommun.containsKey(observation.getNomCommun())) {
            hashObservationParNomCommun.put(observation.getNomCommun(), new ArrayList<Observation>());
        }
        hashObservationParNomCommun.get(observation.getNomCommun()).add(observation);

        if (!hashObservationParDate.containsKey(observation.getDate())) {
            hashObservationParDate.put(observation.getDate(), new ArrayList<Observation>());
        }
        hashObservationParDate.get(observation.getDate()).add(observation);

        if (!hashObservationDateEtNom.containsKey(observation.getNomCommun())) {
            hashObservationDateEtNom.put(observation.getNomCommun(), new HashMap<LocalDate, ArrayList<Observation>>());
            
        }
        if (!hashObservationDateEtNom.get(observation.getNomCommun()).containsKey(observation.getDate())) {
            hashObservationDateEtNom.get(observation.getNomCommun()).put(observation.getDate(), new ArrayList<Observation>());
        }
        hashObservationDateEtNom.get(observation.getNomCommun()).get(observation.getDate()).add(observation);

    }

    /**
     * Retourne très rapidement les observations en lien avec le nom commun fourni,
     * triées par ordre chronologique inverse de la date d'observation.
     * (la date la plus récente est au début de la liste)
     * 
     * @param nomCommun le nom correspondant aux observations à retourner
     * @return la liste des observations
     */
    public ArrayList<Observation> getObservationsParNomCommun(String nomCommun) {
        ArrayList<Observation> listeObs = new ArrayList<Observation>();
        listeObs.addAll(hashObservationParNomCommun.get(nomCommun));
        return listeObs;
    }

    /**
     * Retourne très rapidement les observations de la date passée en paramètre.
     * 
     * @param date la date correspondant aux observations à retourner
     * @return la liste des observations
     */
    
    public ArrayList<Observation> getObservationsParDate(LocalDate date) {
        ArrayList<Observation> listeObs = new ArrayList<Observation>();
        listeObs.addAll(hashObservationParNomCommun.get(date));
        return listeObs;
    }

    /**
     * Retourne très rapidement les observations du nom et de la date passés en
     * paramètre,
     * 
     * @param nomCommun le nom correspondant aux observations à retourner
     * @param date      la date correspondant aux observations à retourner
     * @return la liste des observations
     */
    public ArrayList<Observation> getObservationsParNomCommunEtDate(String nomCommun, LocalDate date) {
        ArrayList<Observation> resultaList = null;

        // vérification de l'année
        if (hashObservationDateEtNom.containsKey(nomCommun)) {
            // vérification du genre
            if (hashObservationDateEtNom.get(nomCommun).containsKey(date)) {
                resultaList = hashObservationDateEtNom.get(nomCommun).get(date);
            } else {
                resultaList = new ArrayList<>();
            }
        } else {
            resultaList = new ArrayList<>();
        }
        return resultaList;
    }

}
