package entities;

import java.io.Serializable;
import java.util.Objects;

public class EpisodiPK implements Serializable {
    private int temporada;
    private int numero;

    public EpisodiPK() {
    }

    public EpisodiPK(int temporada, int numero) {
        this.temporada = temporada;
        this.numero = numero;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EpisodiPK episodiPK = (EpisodiPK) o;
        return temporada == episodiPK.temporada && numero == episodiPK.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(temporada, numero);
    }

    @Override
    public String toString() {
        return "EpisodiPK{" +
                "temporada=" + temporada +
                ", numero=" + numero +
                '}';
    }
}
