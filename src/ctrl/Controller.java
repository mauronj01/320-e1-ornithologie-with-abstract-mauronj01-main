package ctrl;

import java.time.LocalDate;
import java.util.ArrayList;

import models.Observation;
import services.ServiceChargementEspeces;
import services.ServiceIndexationEspeces;
import services.ServiceIndexationObservations;
import services.ServiceJournalObservations;
import services.ServiceTriEspeces;

import views.View;
import views.IViewForController;

public class Controller implements IControllerForView {

    private final IViewForController view;
    private final ServiceChargementEspeces serviceChargementEspeces;
    private final ServiceIndexationEspeces serviceIndexationEspeces;
    private final ServiceTriEspeces serviceTriEspeces;
    private final ServiceJournalObservations serviceJournalObservations;
    private final ServiceIndexationObservations serviceIndexationObservations;

    public Controller() {
        view = new View(this);

        serviceChargementEspeces = new ServiceChargementEspeces();
        serviceIndexationEspeces = new ServiceIndexationEspeces();
        serviceTriEspeces = new ServiceTriEspeces();
        serviceJournalObservations = new ServiceJournalObservations();
        serviceIndexationObservations = new ServiceIndexationObservations();

    }

    public void start() {
        view.start();

    }

    /**
     * Affiche dans la vue la liste des observations concernant le nomCommun passé
     * en paramètre et effectuées à la date passée en paramètre.
     */
    @Override
    public void actionChargerObservationsParEspeceEtDate(String nomCommun, LocalDate date) {
        ArrayList<Observation> listeObservations = serviceIndexationObservations.getObservationsParNomCommunEtDate(nomCommun, date);
        view.afficheListeObservations(listeObservations);
    }

    /*
     * Ajoute une observation et indexe cette observation
     */
    @Override
    public void actionAjouterObservation(Observation observation) {
        serviceJournalObservations.ajouterObservation(observation);
        serviceIndexationObservations.indexerObservation(observation);
    }

    @Override
    public void actionQuitter() {
        // Ici on pourrait faire qqch juste avant de quitter l'application, par exemple
        // sauvegarder la position de la fenêtre, ... mais dans notre cas il n'y a rien
        // à faire.
    }

    /**
     * indexe la liste des espèces.
     */
    @Override
    public void actionIndexerEspeces() {
        serviceIndexationEspeces.indexerLesEspeces(serviceChargementEspeces.getListDesEspeces());
    }

    /**
     * Trie la liste des espèces par NomCommun et affiche la liste des espèces dans
     * la vue.
     */
    @Override
    public void actionTriParNomCommun() {
        view.afficheListeEspeces(
                serviceTriEspeces.getEspecesTrieesParNomCommun(serviceChargementEspeces.getListDesEspeces()));
    }

    /**
     * Trie la liste des espèces par nom scientifique et affiche la liste des
     * espèces dans la vue.
     */
    @Override
    public void actionTriParNomScientifique() {
        view.afficheListeEspeces(
                serviceTriEspeces.getEspecesTrieesParNomScientifique(serviceChargementEspeces.getListDesEspeces()));
    }

    /**
     * Trie la liste des espèces par le nombre de ponte et par durée de séjour au
     * nid, affiche la liste des
     * espèces dans la vue.
     * Si le nombre de ponte est égal entre deux espèces, trie alors par la durée de
     * séjour au nid.
     */
    @Override
    public void actionTriParPonte() {
        view.afficheListeEspeces(
                serviceTriEspeces.getEspecesTrieesParPonte(serviceChargementEspeces.getListDesEspeces()));
    }

    /**
     * Retourne très rapidement la liste des noms commun de toutes les espèces.
     */
    @Override
    public ArrayList<String> getlstNomCommun() {
        return serviceIndexationEspeces.getlstNomCommun();
    }

    /**
     * Indexe toutes les observations existantes.
     */
    @Override
    public void actionIndexerObservations() {
        serviceIndexationObservations.indexerObservations(serviceJournalObservations.getListObservations());
    }

    /**
     * Afficher la liste de toutes les observation dans la vue.
     */
    @Override
    public void actionChargerObservations() {
        view.afficheListeObservations(serviceJournalObservations.getListObservations());
    }

    /**
     * Affiche dans la vue la liste des observations concernant le nomCommun passé
     * en paramètre.
     */
    @Override
    public void actionChargerObservationsParEspece(String nomCommun) {
        view.afficheListeObservations(serviceIndexationObservations.getObservationsParNomCommun(nomCommun));
    }

    /**
     * Affiche dans la vue la liste des observations effectuées à la date passée en
     * paramètre.
     */
    @Override
    public void actionChargerObservationParDate(LocalDate date) {
        view.afficheListeObservations(serviceIndexationObservations.getObservationsParDate(date));
    }

}
