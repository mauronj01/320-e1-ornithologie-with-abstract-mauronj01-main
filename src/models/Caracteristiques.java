package models;

public class Caracteristiques {
    private String groupe;
    private String tailleCm;
    private String envergureCm;
    private String poidsG;
    private String nourriture;
    private String habitat;
    private String comportementMigrateur;
    private String siteDeNidification;
    private Integer dureeIncubationJours;
    private Integer nombreDePontes;
    private Integer nombreOeufs;
    private Integer dureeSejourNidJours;
    private String ageMaximalEURING;
    private String ageMaximalCH;
    private String statutCH;

    public Caracteristiques(String groupe, String tailleCm, String envergureCm, String poidsG, String nourriture,
                            String habitat, String comportementMigrateur, String siteDeNidification, int dureeIncubationJours,
                            int nombreDePontes, int nombreOeufs, int dureeSejourNidJours, String ageMaximalEURING,
                            String ageMaximalCH, String statutCH) {
        this.groupe = groupe;
        this.tailleCm = tailleCm;
        this.envergureCm = envergureCm;
        this.poidsG = poidsG;
        this.nourriture = nourriture;
        this.habitat = habitat;
        this.comportementMigrateur = comportementMigrateur;
        this.siteDeNidification = siteDeNidification;
        this.dureeIncubationJours = dureeIncubationJours;
        this.nombreDePontes = nombreDePontes;
        this.nombreOeufs = nombreOeufs;
        this.dureeSejourNidJours = dureeSejourNidJours;
        this.ageMaximalEURING = ageMaximalEURING;
        this.ageMaximalCH = ageMaximalCH;
        this.statutCH = statutCH;
    }

    public String getGroupe() {
        return groupe;
    }

    public String getTailleCm() {
        return tailleCm;
    }

    public String getEnvergureCm() {
        return envergureCm;
    }

    public String getPoidsG() {
        return poidsG;
    }

    public String getNourriture() {
        return nourriture;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getComportementMigrateur() {
        return comportementMigrateur;
    }

    public String getSiteDeNidification() {
        return siteDeNidification;
    }

    public Integer getDureeIncubationJours() {
        return dureeIncubationJours;
    }

    public Integer getNombreDePontes() {
        return nombreDePontes;
    }

    public Integer getNombreOeufs() {
        return nombreOeufs;
    }

    public Integer getDureeSejourNidJours() {
        return dureeSejourNidJours;
    }

    public String getAgeMaximalEURING() {
        return ageMaximalEURING;
    }

    public String getAgeMaximalCH() {
        return ageMaximalCH;
    }

    public String getStatutCH() {
        return statutCH;
    }

    // Getters pour chaque attribut
    
}

