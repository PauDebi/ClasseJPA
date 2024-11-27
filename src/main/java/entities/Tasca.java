package entities;

import jakarta.persistence.*;

@Entity
public class Tasca {
    @Id
    private char idTasca;
    private String descripcio;
    private int minuts;
    @ManyToOne
    @JoinColumn(name = "usuari", referencedColumnName = "idUsuari")
    private Usuari usuari;

    public Tasca() {
    }

    public Tasca(char idTasca, String descripcio, int minuts, Usuari usuari) {
        this.idTasca = idTasca;
        this.descripcio = descripcio;
        this.minuts = minuts;
        this.usuari = usuari;
    }

    public char getIdTasca() {
        return idTasca;
    }

    public void setIdTasca(char idTasca) {
        this.idTasca = idTasca;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public int getMinuts() {
        return minuts;
    }

    public void setMinuts(int minuts) {
        this.minuts = minuts;
    }

    public Usuari getUsuari() {
        return usuari;
    }

    public void setUsuari(Usuari usuari) {
        this.usuari = usuari;
    }

    @Override
    public String toString() {
        return "Tasca{" +
                "idTasca=" + idTasca +
                ", descripcio='" + descripcio + '\'' +
                ", minuts=" + minuts +
                ", usuari=" + usuari +
                '}';
    }
}
