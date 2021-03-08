package week12;

public class StudentData{
    public static void main(String[] args) {
        //Student object include name,age,gpa
        Student std01 = new Student("Mark",18,4.00);
        Student std02 = new Student("Jane",18,2.20);
        Student std03 = new Student("Peter",19,4.00);
        Student std04 = new Student("Mark",22,1.75);

        System.out.println ("Name) std01 - std02: " + std01.name.equals(std02.name));
        System.out.println ("Name) std01 - std03: " + std01.name.equals(std03.name));
        System.out.println ("Name) std02 - std04: " + std02.name.equals(std04.name));
        System.out.println ("Name) std01 - std04: " + std01.name.equals(std04.name));
        System.out.println("");
        System.out.println ("Age) std01 - std02: " + std01.equals(std02));
        System.out.println ("Age) std03 - std03: " + std03.equals(std04));
        System.out.println ("Age) std01 - std03: " + std01.equals(std03));
        System.out.println("");
        System.out.println("GPA) std01 - std03: " + std01.equals(std03));
        System.out.println("GPA) std02 - std04: " + std02.equals(std04));
        System.out.println("GPA) std02 - std03: " + std02.equals(std03));
    }
}
