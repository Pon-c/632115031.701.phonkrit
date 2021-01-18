package week7;

public class PetData {
    String name, species, colors;
    String size, furSize;
    String speed, water;
    String fly, snack;
    int age;

    public PetData(){

    }

    public PetData(String name, String species, String colors, int age){
        this.name = name;
        this.species = species;
        this.colors = colors;
        this.age = age;
    }

    public void showPetData(){
        System.out.println("Name : " + name + " | Species : " + species + " | Color : " + colors + " | Age : " + age);
    }
}
