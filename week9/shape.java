package week9;

public class shape {
    public String toString(){
        return "This is a shape";
    }
    public static void main (String[] args){
        shape s = new shape();
        rectangle r = new rectangle(5,10);
        cube c = new cube(5,10,20);
        System.out.println(s.toString());
        System.out.println(r.toString());
        System.out.println(c.toString());
    }
}
