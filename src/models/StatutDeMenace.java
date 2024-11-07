package models;

public class StatutDeMenace {
    private String code;
    private String listeRougeCH;
    private boolean especePrioritairePourConservation;

    public StatutDeMenace(String code, String listeRougeCH, boolean especePrioritairePourConservation) {
        this.code = code;
        this.listeRougeCH = listeRougeCH;
        this.especePrioritairePourConservation = especePrioritairePourConservation;
    }

    public String getCode() {
        return code;
    }

    public String getListeRougeCH() {
        return listeRougeCH;
    }

    public boolean isEspecePrioritairePourConservation() {
        return especePrioritairePourConservation;
    }
  
}

