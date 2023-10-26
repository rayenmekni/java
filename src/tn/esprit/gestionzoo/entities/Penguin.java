package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {

    private float swimmingDepth;
    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth)
    {
        this.swimmingDepth = swimmingDepth;
    }

    public float getSwimmingDepth()
    {
        return this.swimmingDepth;
    }

    @Override
    public void swim()
    {
        System.out.println("This aquatic animal is swimming.");
    }

    @Override
    public String toString()
    {
        return("Nom: "+ this.getName() + "Famille: "+ this.getFamily() + "age : "+ this.getAge() +" Habitat : "+ this.getHabitat() + " Swimming Depth : " + swimmingDepth);
    }
}
