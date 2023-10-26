package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic {

    private float swimmingSpeed;
    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed)
    {
        this.swimmingSpeed = swimmingSpeed;
    }

    public float getSwimmingSpeed()
    {
        return this.swimmingSpeed;
    }

    @Override
    public void swim()
    {
        System.out.println("This dolphin is swimming.");
    }
    @Override
    public String toString()
    {
        return("Nom: "+ this.getName() + "Famille: "+ this.getFamily() + "age : "+ this.getAge() +" Habitat : "+ this.getHabitat()  + " Swimming speed : " + swimmingSpeed);
    }
}
