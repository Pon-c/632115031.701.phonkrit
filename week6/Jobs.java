package week6;

public class Jobs extends Person {
    String genre;

    public Jobs(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showJobs() {
        System.out.println(name + " aged " + age + " is a " + genre);
    }
}

