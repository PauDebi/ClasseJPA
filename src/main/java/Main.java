import entities.Adreca;
import entities.Empleat;
import entities.Tasca;
import entities.Usuari;
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

            Usuari usuari = manager.find(Usuari.class, 1);
            Tasca tasca = new Tasca('A', "Fer Llits", 20, usuari);
            Tasca tasca1 = new Tasca('B', "Fer Menjar", 30, usuari);
            Tasca tasca2 = new Tasca('C', "Compra pa", 45, usuari);
            Tasca tasca3 = new Tasca('D', "Dinar", 20, usuari);
            Tasca tasca4 = new Tasca('E', "Sopar", 20, usuari);

            manager.persist(tasca);
            manager.persist(tasca1);
            manager.persist(tasca2);
            manager.persist(tasca3);
            manager.persist(tasca4);





            manager.getTransaction().commit();
        }
    }
}
