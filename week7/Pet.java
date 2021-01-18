package week7;
public class Pet{
    public static void main(String [] args){

        Dog dog1 = new Dog("Korone", "Dawg", "Brown", 2);
        Fish fish1 = new Fish("Gura", "Shark", "Blue andwhite", 3);
        Cat cat1 = new Cat("Peko", "Felis", "Gray", 1);

        dog1.size = "Medium";
        dog1.furSize = "short hair";
        dog1.showPetData();
        dog1.Bark();
        dog1.Play();
        dog1.isShortHair();

        cat1.size = "Big";
        cat1.showPetData();
        cat1.Dance();
        cat1.Meow();
        cat1.Size();

        fish1.size = "Small";
        fish1.isSleep = "Sleep";
        fish1.showPetData();
        fish1.Blurb();
        fish1.Size();
        fish1.isSleep();
    }
}