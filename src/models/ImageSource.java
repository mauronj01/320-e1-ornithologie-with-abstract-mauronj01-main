package models;

public class ImageSource {
    private String especeImagePath;
    private String repartitionImagePath;

    public ImageSource(String especeImagePath, String repartitionImagePath) {
        this.especeImagePath = especeImagePath;
        this.repartitionImagePath = repartitionImagePath;
    }

    public String getEspeceImagePath() {
        return especeImagePath;
    }

    public void setEspeceImagePath(String especeImagePath) {
        this.especeImagePath = especeImagePath;
    }

    public String getRepartitionImagePath() {
        return repartitionImagePath;
    }

    public void setRepartitionImagePath(String repartitionImagePath) {
        this.repartitionImagePath = repartitionImagePath;
    }
}

