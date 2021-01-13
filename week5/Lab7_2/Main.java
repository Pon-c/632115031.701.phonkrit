// Phonkrit Chinatiworn 632115031
package week5.Lab7_2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double rad1 = 1;
        double rad2 = 1;

        Scanner input = new Scanner(System.in);
        System.out.println("Input Circle 1 Origin Point");
        System.out.print("Enter Origin point X : ");
        double x1 = input.nextDouble();
        System.out.print("Enter Origin point Y : ");
        double y1 = input.nextDouble();
        System.out.println("Input Circle 2 Origin Point");
        System.out.print("Enter Origin point X : ");
        double x2 = input.nextDouble();
        System.out.print("Enter Origin point Y : ");
        double y2 = input.nextDouble();

        double radinput = 0;
        System.out.println("User want to insert radius value? \n -1 = No , Any other number = Yes");
        radinput = input.nextDouble();
        if (radinput == -1){
        }
        else{
        System.out.print("Enter radius for Circle 1 : ");
        rad1 = input.nextDouble();
        System.out.print("Enter radius for Circle 2 : ");
        rad2 = input.nextDouble();
        }
        input.close();

        System.out.println("");
        System.out.println("First Circle");

        Circle circle1 = new Circle(x1,y1,rad1);
        circle1.area();
        circle1.circumference();

        System.out.println("");
        System.out.println("Second Circle");

        Circle circle2 = new Circle(x2,y2,rad2);
        circle2.area();
        circle2.circumference();
        circle2.distance(x2,x1,y2,y1);
        circle2.intersect(rad1,rad2);
    }

}
