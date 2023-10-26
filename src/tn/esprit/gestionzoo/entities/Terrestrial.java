package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal {

    private int nbrLegs;
    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {

        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;

    }

    @Override
    public String toString()
    {
        return("Nom: "+ this.getName() + "Famille: "+ this.getFamily() + "age : "+ this.getAge() + " Legs number : " + nbrLegs);
    }

}
