package week7;

public class Dog extends PetData{
    String size, furSize;

    public Dog(String name, String species, String colors, int age){
        this.name = name;
        this.species = species;
        this.colors = colors;
        this.age = age;
    }

    public void Play(){
        System.out.println("My dog " + name + " is playing outside");
    }

    public void Bark(){
        System.out.println("Hong Hong");
    }

    public void isShortHair(){
        System.out.println("Size : " + size);
        String answer;

        if (furSize.equals("short hair")){
            answer = "True";
        }
        else {
            answer = "False";
        }
        System.out.println("Short hair : " + answer);
        }
    }

