import entities.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager manager = factory.createEntityManager();

        try (factory; manager){
            manager.getTransaction().begin();
//________________________________________________________________________________

            //persist

            //Empleat empleat = new Empleat(1, "Pepito", LocalDate.of(2000, Month.APRIL, 12), 1000);
            //manager.persist(empleat);

            /*Empleat e_llegit = manager.find(Empleat.class, 1);
            System.out.println(e_llegit);*/

//________________________________________________________________________________
//Buscar un objeto en la base de datos
            //find

            //Empleat e2 = manager.find(Empleat.class, 1);
            //System.out.println(e2);

//________________________________________________________________________________
// El refresh es para que se actualice el objeto con la información de la base de datos
            //refresh

            //e2.setNom("Pepito2");
            //System.out.println(e2);
            //manager.refresh(e2);
            //System.out.println(e2);

//________________________________________________________________________________
// Para Optimizar
            //getReference

            //Empleat e3 = manager.getReference(Empleat.class, 1);

            //System.out.println(e3);

//________________________________________________________________________________

            //Modificar
            //e3.setsalary(2000);

//________________________________________________________________________________

            //Remove
            //manager.remove(e3);

//________________________________________________________________________________

            //Detach
            //Empleat e4 = manager.find(Empleat.class, 1);
            //System.out.println(e4);
            //manager.detach(e4);

            //manager.remove(e4);

//________________________________________________________________________________

            //merge
            //Empleat e5 = new Empleat(1, "Pepito", LocalDate.of(2000, Month.APRIL, 12), 1000);
            //Empleat e5_nou = manager.merge(e5);
            //System.out.println(e5_nou);

            //Empleat e6 = new Empleat(2, "Pepito2", LocalDate.of(2000, Month.APRIL, 12), 1000);
            //Empleat e7 = manager.merge(e6);
            //System.out.println(e7);

//________________________________________________________________________________

            //flush
            //Empleat e8 = new Empleat(6, "Pepito3", LocalDate.of(2000, Month.APRIL, 12), 1000);
            //manager.persist(e8);
            //manager.flush();

//________________________________________________________________________________

            //detach
//            Empleat e9 = manager.find(Empleat.class, 6);
//
//            if (manager.contains(e9))
//                System.out.println("L'empleat 6 es al contexte de persistencia");
//            else
//                System.out.println("L'empleat 6 no es al contexte de persistencia");

//________________________________________________________________________________

            //relaciones 1:1
//            Adreca adreca = new Adreca(1, "Carrer", "07300", "UnaPoblacio");
//           Usuari usuari = new Usuari(1, "Pepito", adreca);
//
//            manager.persist(adreca);
//            manager.persist(usuari);

            //Usuari u = manager.find(Usuari.class, 3);
            //System.out.println(u);

//            Adreca a = manager.find(Adreca.class, 1);

//            System.out.println(a);

//            Usuari usuari = manager.find(Usuari.class, 1);
//            Tasca tasca = new Tasca('A', "Fer Llits", 20, usuari);
//            Tasca tasca1 = new Tasca('B', "Fer Menjar", 30, usuari);
//            Tasca tasca2 = new Tasca('C', "Compra pa", 45, usuari);
//            Tasca tasca3 = new Tasca('D', "Dinar", 20, usuari);
//            Tasca tasca4 = new Tasca('E', "Sopar", 20, usuari);
//
//            manager.persist(tasca);
//            manager.persist(tasca1);
//            manager.persist(tasca2);
//            manager.persist(tasca3);
//            manager.persist(tasca4);


//________________________________________________________________________________

//            Usuari maria = manager.find(Usuari.class, 1);
//
//
//            System.out.println(maria);
//
//            System.out.println(maria.getTasques());

//________________________________________________________________________________

            //relaciones M:N

//            Producte producte = new Producte("PAN", "Pa", "comida");
//            Producte producte1 = new Producte("LET", "Llet", "comida");
//            Producte producte2 = new Producte("AIG", "Aigua", "comida");
//            Producte producte3 = new Producte("SAL", "Sal", "comida");
//            Producte producte4 = new Producte("OUS", "Ous", "comida");
//
//            manager.persist(producte);
//            manager.persist(producte1);
//            manager.persist(producte2);
//            manager.persist(producte3);
//            manager.persist(producte4);
//
//
//
//            Usuari usuari = manager.find(Usuari.class, 1);
//
//            usuari.getProductesComprats().add(producte);
//
//            usuari.getProductesComprats().add(producte);
//            usuari.getProductesComprats().add(producte1);
//            usuari.getProductesComprats().add(producte2);
//            usuari.getProductesComprats().add(producte3);
//            usuari.getProductesComprats().add(producte4);

//________________________________________________________________________________

            //Key Composite

//            Episodi episodi = new Episodi(new EpisodiPK(1, 1), "El primer episodi de la serie", 20);
//            Episodi episodi1 = new Episodi(new EpisodiPK(1, 2), "El segon episodi de la serie", 21);
//            Episodi episodi2 = new Episodi(new EpisodiPK(1, 3), "El tercer episodi de la serie", 23);
//            Episodi episodi3 = new Episodi(new EpisodiPK(1, 4), "El quart episodi de la serie", 22);
//            Episodi episodi4 = new Episodi(new EpisodiPK(1, 5), "El cinque episodi de la serie", 21);
//
//            manager.persist(episodi);
//            manager.persist(episodi1);
//            manager.persist(episodi2);
//            manager.persist(episodi3);
//            manager.persist(episodi4);

//            Capitol capitol = new Capitol(2, 1, "El primer capitol de la teporada 2", 90);
//            Capitol capitol1 = new Capitol(2, 2, "El segon capitol de la teporada 2", 45);
//            Capitol capitol2 = new Capitol(2, 3, "El tercer capitol de la teporada 2", 50);
//            Capitol capitol3 = new Capitol(2, 4, "El quart capitol de la teporada 2", 49);
//            Capitol capitol4 = new Capitol(2, 5, "El cinque capitol de la teporada 2", 46);
//
//            manager.persist(capitol);
//            manager.persist(capitol1);
//            manager.persist(capitol2);
//            manager.persist(capitol3);
//            manager.persist(capitol4);


//________________________________________________________________________________

            //Exercice

//            Ciutat inca = new Ciutat(1, "Inca");
//            Ciutat palma = new Ciutat(2, "Palma");
//
//            manager.persist(inca);
//            manager.persist(palma);
//
//
//            Alumne alumne = new Alumne(1, "Pepito", "Correo", inca);
//            Alumne alumne1 = new Alumne(2, "Paco", "Correo1", palma);
//
//            manager.persist(alumne);
//            manager.persist(alumne1);

//            Modul modul = new Modul("AED", "Programacio", 200);
//            Modul modul1 = new Modul("M3", "Matematiques", 100);
//            Modul modul2 = new Modul("FOL", "Formacio i orientacio laboral", 50);
//
//            manager.persist(modul);
//            manager.persist(modul1);
//            manager.persist(modul2);
//
//
//            Alumne a1 = manager.find(Alumne.class, 1);
//
//            a1.getModuls().add(modul);
//            a1.getModuls().add(modul1);
//            a1.getModuls().add(modul2);


            manager.getTransaction().commit();
        }
    }
}
