package week7;

public class Fish extends PetData{
    String size,isSleep;

    public Fish(String name, String species, String colors, int age){
        this.name = name;
        this.species = species;
        this.colors = colors;
        this.age = age;
    }

    public void Swim(){
        System.out.println("My fish " + name + " like to swim around a lot");
    }

    public void Blurb(){
        System.out.println("Blurb Blurb");
    }

    public void Size(){
        System.out.println("She's a " + size + " sized Sharkie, so cute");
    }

    public void isSleep(){
        if (isSleep.equals("sleep")){
        System.out.println("Sssshhhh, She's sleeping");
        }
        else {
            System.out.println("Oh look! She's not sleeping");   
        }
    }
}
