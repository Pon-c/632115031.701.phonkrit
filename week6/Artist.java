package week6;

public class Artist extends Person {
    String genre;

    public Artist(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void playMusic() {
        System.out.println(name + " is playing " + genre + " music.");
    }

    public void engineer() {
        System.out.println(name + " is a " + genre);
    }
}
