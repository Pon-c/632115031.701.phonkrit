package week6;

public class Engineer extends Person {
    String genre;

    public Engineer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showEngineer() {
        System.out.println(name + " aged " + age + " is a " + genre);
    }
}