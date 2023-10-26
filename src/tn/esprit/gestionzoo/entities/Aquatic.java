package tn.esprit.gestionzoo.entities;

public abstract class Aquatic extends Animal{

    private String habitat;
    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;

    }

    public void setHabitat(String habitat)
    {
        this.habitat = habitat;
    }

    public String getHabitat()
    {
        return this.habitat;
    }

    public abstract void swim();
    @Override
    public String toString()
    {
        return("Nom: "+ this.getName() + " Famille: "+ this.getFamily() + " age : "+ this.getAge() + " Habitat : " + habitat);
    }

    @Override
    public boolean equals(Object obj) {
        if(null == obj) return false;
        if (obj instanceof Aquatic a)
        {
            return a.getName().equals(this.getName()) && a.getAge() == this.getAge() && a.getHabitat().equals(this.getHabitat());
        }

        return false;
    }
}

