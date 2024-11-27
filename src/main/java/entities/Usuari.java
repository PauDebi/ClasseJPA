package entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Usuari {
    @Id
    private int idUsuari;
    private String nom;
    @OneToOne
    @JoinColumn(name = "adreca", referencedColumnName = "idAdreca")
    private Adreca adreca;
    @OneToMany(mappedBy = "usuari")
    private List<Tasca> tasques;


    public Usuari(int idUsuari, String nom, Adreca adreca) {
        this.idUsuari = idUsuari;
        this.nom = nom;
        this.adreca = adreca;
    }

    public Usuari() {
    }

    public int getIdUsuari() {
        return idUsuari;
    }

    public void setIdUsuari(int idUsuari) {
        this.idUsuari = idUsuari;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Adreca getAdreca() {
        return adreca;
    }

    public void setAdreca(Adreca adreca) {
        this.adreca = adreca;
    }
}