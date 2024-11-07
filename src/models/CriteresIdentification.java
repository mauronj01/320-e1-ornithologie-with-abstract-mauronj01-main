package models;

public class CriteresIdentification {
    private String plumage;
    private String bec;
    private String tete;
    private String queue;
    private String vol;
    private String sexes;

    public CriteresIdentification(String plumage, String bec, String tete, String queue, String vol, String sexes) {
        this.plumage = plumage;
        this.bec = bec;
        this.tete = tete;
        this.queue = queue;
        this.vol = vol;
        this.sexes = sexes;
    }

    public String getPlumage() {
        return plumage;
    }

    public String getBec() {
        return bec;
    }

    public String getTete() {
        return tete;
    }

    public String getQueue() {
        return queue;
    }

    public String getVol() {
        return vol;
    }

    public String getSexes() {
        return sexes;
    }

    
}
