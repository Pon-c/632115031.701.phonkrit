// Phonkrit Chinatiworn 632115031
package week9;

public class Testoverride1 {
    public static void main(String[] args){
        Person person1;
        Sheriff person2;
        Teacher person3;
        PrimeMinister person4;
        Football person5;
        Engineer person6;
        person1 = new Person("Mark", 2001);
        person2 = new Sheriff("Mateo", 1988,"California");
        person3 = new Teacher("Ball", 1977,"CMU");
        person4 = new PrimeMinister("Tu",1954,"Thailand");
        person5 = new Football("Messi",1987,"Barcelona football club");
        person6 = new Engineer("Jack", 1996, "England");

        person1.introduce();
        person2.introduce();
        person3.introduce();
        person4.introduce();
        person5.introduce();
        person6.introduce();
    }
}
