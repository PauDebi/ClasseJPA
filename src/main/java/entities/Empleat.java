package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Empleat {
    @Id
    private int id;
    private String nom;
    private LocalDate naixement;
    private double salary;

    public Empleat() {
    }

    public Empleat(int id, String nom, LocalDate naixement, double salary) {
        this.id = id;
        this.nom = nom;
        this.naixement = naixement;
        this.salary = salary;
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

    public LocalDate getnaixement() {
        return naixement;
    }

    public void setnaixement(LocalDate naixement) {
        this.naixement = naixement;
    }

    public double getsalary() {
        return salary;
    }

    public void setsalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Empleat{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", naixement=" + naixement +
                ", salary=" + salary +
                '}';
    }
}
