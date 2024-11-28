package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Ciutat {
    @Id
    private int id;
    private String nom;

    public Ciutat() {
    }

    public Ciutat(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Ciutat{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }
}
