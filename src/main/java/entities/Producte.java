package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Producte {
    @Id
    private String referencia;
    private String nom;
    private String descripcio;

    public Producte() {
    }

    public Producte(String referencia, String nom, String descripcio) {
        this.referencia = referencia;
        this.nom = nom;
        this.descripcio = descripcio;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    @Override
    public String toString() {
        return "Producte{" +
                "referencia='" + referencia + '\'' +
                ", nom='" + nom + '\'' +
                ", descripcio='" + descripcio + '\'' +
                '}';
    }
}
