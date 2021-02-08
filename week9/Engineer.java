package week9;

public class Engineer extends Person {
    String workState;

    public Engineer(String name, int bornYear, String workState){
        super(name, bornYear);
        this.workState = workState;
    }

    // overiding method
    public void introduce(){
        super.introduce();
        System.out.println("I'm an engineer and work in " + workState + ".");
    }
}
