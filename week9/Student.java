package week9;
import java.util.Scanner;

public class Student {
    private String firstname = "Hello";
    private String lastname = "World";
    //overiding toString()

    public String toString(){
        Scanner input = new Scanner(System.in);
        System.out.println("Input first name");
        firstname = input.next();
        System.out.println("Input first name");
        lastname = input.next();
        input.close();
        return "My first name "+firstname+" last name "+lastname;
    }

    public static void main(String[] args){
        Student p = new Student();
        System.out.println(p.toString());
    }
    
}
