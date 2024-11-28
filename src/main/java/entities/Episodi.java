package entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Episodi {
    @EmbeddedId
    private EpisodiPK episodiPK;
    private String titol;
    private int minuts;

    public Episodi() {
    }

    public Episodi(EpisodiPK episodiPK, String titol, int minuts) {
        this.episodiPK = episodiPK;
        this.titol = titol;
        this.minuts = minuts;
    }

    public EpisodiPK getEpisodiPK() {
        return episodiPK;
    }

    public void setEpisodiPK(EpisodiPK episodiPK) {
        this.episodiPK = episodiPK;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public int getMinuts() {
        return minuts;
    }

    public void setMinuts(int minuts) {
        this.minuts = minuts;
    }

    @Override
    public String toString() {
        return "Episodi{" +
                "episodiPK=" + episodiPK +
                ", titol='" + titol + '\'' +
                ", minuts=" + minuts +
                '}';
    }
}
