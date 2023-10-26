package tn.esprit.gestionzoo.main;// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.io.PipedInputStream;
import java.util.Scanner;
import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {

    public static void main(String[] args) {

        String zooName;
        String city;
        int nbrCages;
        int age;
        String animalName;
        String animalFamily;
        Animal lion = new Animal("b","azertgf",10,true);
        Animal a1 = new Animal("b","gfdqg",11,true);
        Animal a2 = new Animal("a","gqflouch",5,true);
        Animal a3 = new Animal("a","qsuch",4,true);
        Animal a4 = new Animal("ba","auch",3,true);
        Animal a5 = new Animal("ba","ouch",12,true);
        Animal a6 = new Animal("baa","aaa",20,true);
        Zoo z = new Zoo("ZZZ","GGG",25);
        Zoo z1 = new Zoo("ZZZ1","FFF",23);
        Zoo z2 = new Zoo("ZZZ2","sss",20);
        Scanner get = new Scanner(System.in);
        do {

            System.out.println("Donner le nom de zoo ");
            zooName = get.nextLine();

        }while(zooName.length() < 1);

        System.out.println("Donner city ");
        city = get.nextLine();

        System.out.println("Donner le nombre de cages ");
        nbrCages = get.nextInt();
        get.nextLine();

        Zoo z3 = new Zoo(zooName, city, nbrCages);

        System.out.println("Donner le nom d'animal ");
        animalName = get.nextLine();
        System.out.println("Donner la famille d'animal ");
        animalFamily = get.nextLine();

        do {

            System.out.println("Donner l'age d'animal ");
            age = get.nextInt();

        }while(age < 0);


        System.out.println(z);
        z.addAnimal(a1);
        z.addAnimal(a2);
        z.addAnimal(lion);
        z.addAnimal(a3);
        z1.addAnimal(a1);
        z1.addAnimal(a2);
        z2.addAnimal(a1);
        z2.addAnimal(a2);
        z2.addAnimal(lion);
        z2.addAnimal(a3);
        z2.addAnimal(a5);
        z2.addAnimal(a6);
        z.displayZoo();
        System.out.println(z.searchAnimal(a2));
        System.out.println(z.searchAnimal(a3));
        z.displayAnimals();
        z.removeAnimal(a2);
        z.displayAnimals();
        System.out.println(z.isZooFull());
        System.out.println(z1.isZooFull());
        System.out.println(z2.isZooFull());
        System.out.println(Zoo.comparerZoo(z,z1));
        System.out.println(Zoo.comparerZoo(z2,z1));
        System.out.println(Zoo.comparerZoo(z,z2));

        Penguin p = new Penguin("test", "test", 10, true ,"b7ar",10 );
        Penguin p1 = new Penguin("test", "test", 10, true ,"b7ar",25 );
        Dolphin d = new Dolphin("test", "test", 10, true ,"b7ar",20 );

        p.swim();
        d.swim();

        z.addAquaticAnimal(p);
        z.addAquaticAnimal(p1);
        z.addAquaticAnimal(d);
        z.displayNumberOfAquaticsByType();
        System.out.println(z.maxPenguinSwimmingDepth());
        System.out.println(p.equals(d));



    }
}