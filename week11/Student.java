package week12;

public class Student {
    String name;
    int age;
    double grade;

    public Student(String name, int age, double grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return this.getName() == ((Student) obj).getName();
    }

    public boolean equals1(Object obj) {

        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return this.getAge() == ((Student) obj).getAge();
    }

    public boolean equals2(Object obj) {

        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return this.getGrade() == ((Student) obj).getGrade();
    }
}
