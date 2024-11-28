package entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Alumne {
    @Id
    private int nAlumne;
    private String nom;
    private String correu;
    @ManyToOne
    @JoinColumn(name = "ciutat", referencedColumnName = "id")
    private Ciutat ciutat;
    @ManyToMany
    @JoinTable(name = "matricula", joinColumns = @JoinColumn(name = "alumne", referencedColumnName = "nAlumne"),
            inverseJoinColumns = @JoinColumn(name = "modul", referencedColumnName = "codi"))
    private List<Modul> moduls;

    public Alumne() {
    }

    public Alumne(int nAlumne, String nom, String correu, Ciutat ciutat) {
        this.nAlumne = nAlumne;
        this.nom = nom;
        this.correu = correu;
        this.ciutat = ciutat;
    }

    public int getnAlumne() {
        return nAlumne;
    }

    public void setnAlumne(int nAlumne) {
        this.nAlumne = nAlumne;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCorreu() {
        return correu;
    }

    public void setCorreu(String correu) {
        this.correu = correu;
    }

    public Ciutat getCiutat() {
        return ciutat;
    }

    public void setCiutat(Ciutat ciutat) {
        this.ciutat = ciutat;
    }

    @Override
    public String toString() {
        return "Alumne{" +
                "nAlumne=" + nAlumne +
                ", nom='" + nom + '\'' +
                ", correu='" + correu + '\'' +
                ", ciutat=" + ciutat +
                '}';
    }

    public List<Modul> getModuls() {
        return moduls;
    }

    public void setModuls(List<Modul> moduls) {
        this.moduls = moduls;
    }
}
