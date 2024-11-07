package models;

public class EspeceDetail extends Espece {
private StatutDeMenace statutDeMenace;
private CriteresIdentification criteresIdentification;
private Caracteristiques caracteristiques;
private Population population;
private ImageSource imageSource;

    public EspeceDetail(String nomCommun, String nomScientifique, String description, StatutDeMenace statutDeMenace,
            CriteresIdentification criteresIdentification, Caracteristiques caracteristiques, Population population,
            ImageSource imageSource) {
        super(nomCommun, nomScientifique, description);
        this.statutDeMenace = statutDeMenace;
        this.criteresIdentification = criteresIdentification;
        this.caracteristiques = caracteristiques;
        this.population = population;
        this.imageSource = imageSource;
    }

    public StatutDeMenace getStatutDeMenace() {
        return statutDeMenace;
    }

    public CriteresIdentification getCriteresIdentification() {
        return criteresIdentification;
    }

    public Caracteristiques getCaracteristiques() {
        return caracteristiques;
    }

    public Population getPopulation() {
        return population;
    }

    public ImageSource getImage() {
        return imageSource;
    }

    public void setImage(ImageSource imageSource) {
        this.imageSource = imageSource;
    }

    @Override
    public String toString() {
        return nomCommun + " : " + nomScientifique;
    }
    

    @Override
    public int compareTo(Espece autrEspece) {
        return this.nomCommun.compareTo(autrEspece.nomCommun);
    }
}
