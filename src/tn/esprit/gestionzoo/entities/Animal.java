package tn.esprit.gestionzoo.entities;

public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public Animal(String family, String name, int age, boolean
            isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public String getFamily()
    {
        return this.family;
    }

    public void setFamily(String family)
    {
        this.family = family;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public int getAge()
    {
        return this.age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public boolean getIsMamal()
    {
        return this.isMammal;
    }

    public void setIsMamal(boolean isMammal)
    {
        this.isMammal = isMammal;
    }

    @Override
    public String toString()
    {
        return("Nom: "+ this.name + "Famille: "+ this.family + "age : "+ this.age);
    }

}


