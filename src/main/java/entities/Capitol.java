package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@Table(name = "episodi")
@IdClass(CapitolPK.class)
public class Capitol {
    @Id
    private int temporada;
    @Id
    private int numero;
    private String titol;
    private int minuts;

    public Capitol() {
    }

    public Capitol(int temporada, int numero, String titol, int minuts) {
        this.temporada = temporada;
        this.numero = numero;
        this.titol = titol;
        this.minuts = minuts;
    }


    @Override
    public String toString() {
        return "Capitol{" +
                "temporada=" + temporada +
                ", numero=" + numero +
                ", titol='" + titol + '\'' +
                ", minuts=" + minuts +
                '}';
    }
}
