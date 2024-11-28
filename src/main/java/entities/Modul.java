package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Modul {
    @Id
    private String codi;
    private String nom;
    private int hores;

    public Modul(String codi, String nom, int hores) {
        this.codi = codi;
        this.nom = nom;
        this.hores = hores;
    }

    public Modul() {
    }

    public String getCodi() {
        return codi;
    }

    public void setCodi(String codi) {
        this.codi = codi;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getHores() {
        return hores;
    }

    public void setHores(int hores) {
        this.hores = hores;
    }

    @Override
    public String toString() {
        return "Modul{" +
                "codi=" + codi +
                ", nom='" + nom + '\'' +
                ", hores=" + hores +
                '}';
    }
}
