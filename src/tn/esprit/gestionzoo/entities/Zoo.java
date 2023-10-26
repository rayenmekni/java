package tn.esprit.gestionzoo.entities;

public class Zoo {

    private Animal [] animals;

    private Aquatic [] aquaticAnimals;
    private String name;
    private String city;
    private final int nbrCages;
    public Zoo(String name, String city, int nbrCages) {
        animals = new Animal[25];
        aquaticAnimals = new Aquatic[10];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }

    public Animal [] getAnimals()
    {
        return this.animals;
    }

    public String getName()
    {
        return this.name;
    }

    public String getCity()
    {
        return this.city;
    }

    public int getNbrCages()
    {
        return this.nbrCages;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setCity(String city)
    {
        this.city = city;
    }




    public void displayZoo()
    {
        System.out.println("Nom de zoo: " + this.name + " City: "+ this.city + " Nombre de cages: " + this.nbrCages);
    }

    public void displayAnimals()
    {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
    public boolean addAnimal(Animal animal)
    {
        if(this.searchAnimal(animal) != -1 || this.isZooFull())
        {
            return false;
        }

        for(int i = 0; i < nbrCages; i++)
        {

            if(animals[i] == null)
            {
                animals[i] = animal;
                System.out.println("Ajout d'animal num " + i+ " sucées");
                return true;
            }
        }

        return false;
    }

    public int searchAnimal(Animal animal)
    {
        for(int i = 0; i < nbrCages; i++)
        {
            if(animals[i] == animal)
            {
                return i;
            }
        }

        return -1;
    }

    public boolean removeAnimal(Animal animal)
    {
        int index = searchAnimal(animal);
        if(index != -1)
        {
            for(int i = index; i < animals.length - 1; i++)
            {
                animals[i] = animals[i + 1];
            }
            // in case the array was full we need to replace the last one with a null so the last two cases won't be the same because we deleted an object from the array
            animals[animals.length - 1] = null;
            System.out.println("animal deleted ");
            return true;
        }

        return false;

    }

    public boolean isZooFull()
    {
        for(int i = 0; i < nbrCages; i++)
        {
            if(animals[i] == null)
            {
                return false;
            }
        }

        return true;
    }

    public int numberOfAnimals()
    {
        int nb = 0;
        for(int i = 0; i < nbrCages; i++)
        {
            if(animals[i] != null)
            {
                nb = nb + 1;
            }
        }

        return nb;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2)
    {
        if(z1.numberOfAnimals() >= z2.numberOfAnimals())
        {
            return z1;
        }
        else
        {
            return z2;
        }

    }


    public void addAquaticAnimal(Aquatic aquatic)
    {
        boolean added = false;

        for(int i = 0; i < 10 && !added; i++)
        {

            if(aquaticAnimals[i] == null)
            {
                aquaticAnimals[i] = aquatic;
                System.out.println("Ajout d'animal aquatic num " + i+ " sucées");
                added = true;
            }
        }

        if(!added)
        {
            System.out.println("Adding wasn't successful !!!");
        }


    }

    public float maxPenguinSwimmingDepth()
    {
        float max = 0;
        for(int i = 0; i < 10; i++)
        {
            if(aquaticAnimals[i] instanceof Penguin p)
            {
                if(p.getSwimmingDepth() > max)
                {
                    max = p.getSwimmingDepth();
                }
            }
        }

        return max;
    }

    public void displayNumberOfAquaticsByType()
    {
        int numberOfDolphins = 0;
        int numberOfPenguins = 0;

        for(int i = 0; i < 10; i++)
        {
            if(aquaticAnimals[i] instanceof Penguin)
            {
                numberOfPenguins++;
            }

            if(aquaticAnimals[i] instanceof Dolphin)
            {
                numberOfDolphins++;
            }
        }

        System.out.println("Number of dolphins = " + numberOfDolphins + " Number of penguins = "+ numberOfPenguins);

    }

    @Override
    public String toString()
    {
        return("Nom: "+ this.name + "city: "+ this.city + "nombre de cages : "+ this.nbrCages +" Nombre d'animaux: " + this.numberOfAnimals());
    }
}
