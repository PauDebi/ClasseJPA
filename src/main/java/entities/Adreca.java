package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Adreca {
    @Id
    private int idAdreca;
    private String carrer;
    private String codi_Postal;
    private String poblacio;

    public Adreca() {
    }

    public Adreca(int idAdreca, String carrer, String codi_Postal, String poblacio) {
        this.idAdreca = idAdreca;
        this.carrer = carrer;
        this.codi_Postal = codi_Postal;
        this.poblacio = poblacio;
    }

    public int getIdAdreca() {
        return idAdreca;
    }

    public void setIdAdreca(int idAdreca) {
        this.idAdreca = idAdreca;
    }

    public String getCarrer() {
        return carrer;
    }

    public void setCarrer(String carrer) {
        this.carrer = carrer;
    }

    public String getcodi_Postal() {
        return codi_Postal;
    }

    public void setcodi_Postal(String codi_Postal) {
        this.codi_Postal = codi_Postal;
    }

    public String getPoblacio() {
        return poblacio;
    }

    public void setPoblacio(String poblacio) {
        this.poblacio = poblacio;
    }

    @Override
    public String toString() {
        return "Adreca{" +
                "idAdreca=" + idAdreca +
                ", carrer='" + carrer + '\'' +
                ", codi_Postal='" + codi_Postal + '\'' +
                ", poblacio='" + poblacio + '\'' +
                '}';
    }
}