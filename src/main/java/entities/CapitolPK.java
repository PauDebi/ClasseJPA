package entities;

import java.io.Serializable;
import java.util.Objects;

public class CapitolPK implements Serializable {
    private int temporada;
    private int numero;

    public CapitolPK() {
    }

    public CapitolPK(int temporada, int numero) {
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
        CapitolPK capitolPK = (CapitolPK) o;
        return temporada == capitolPK.temporada && numero == capitolPK.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(temporada, numero);
    }

    @Override
    public String toString() {
        return "CapitolPK{" +
                "temporada=" + temporada +
                ", numero=" + numero +
                '}';
    }
}
