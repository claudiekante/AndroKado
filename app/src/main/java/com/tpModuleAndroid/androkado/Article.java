package com.tpModuleAndroid.androkado;

public class Article {
    private int idArticle;
    private String descriptionArticle;
    private float prixArticle;
    private int degreEnvie;
    private String urlArticle;

    public Article(int idArticle, String descriptionArticle, float prixArticle, int degreEnvie, String urlArticle) {
        this.idArticle = idArticle;
        this.descriptionArticle = descriptionArticle;
        this.prixArticle = prixArticle;
        this.degreEnvie = degreEnvie;
        this.urlArticle = urlArticle;
    }

    public void setIdArticle(int idArticle) {
        this.idArticle = idArticle;
    }

    public void setDescriptionArticle(String descriptionArticle) {
        this.descriptionArticle = descriptionArticle;
    }

    public void setPrixArticle(float prixArticle) {
        this.prixArticle = prixArticle;
    }

    public void setDegreEnvie(int degreEnvie) {
        this.degreEnvie = degreEnvie;
    }

    public void setUrlArticle(String urlArticle) {
        this.urlArticle = urlArticle;
    }

    public int getIdArticle() {
        return idArticle;
    }

    public String getDescriptionArticle() {
        return descriptionArticle;
    }

    public float getPrixArticle() {
        return prixArticle;
    }

    public int getDegreEnvie() {
        return degreEnvie;
    }

    public String getUrlArticle() {
        return urlArticle;
    }
}
