package week7;

public class Cat extends PetData{
    String size;
    public Cat(String name, String species, String colors, int age){
        this.name = name;
        this.species = species;
        this.colors = colors;
        this.age = age;
    }

    public void Dance(){
        System.out.println("My cat " + name + " is dancing on the floor");
    }

    public void Meow(){
        System.out.println(" Meow Meowwww");
    }

    public void Size(){
        System.out.println("She is a " + size + " sized cat");
    }
}
