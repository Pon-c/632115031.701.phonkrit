// Phonkrit Chinatiworn 632115031
package Lab7_2;
public class Circle {
    private double radius = 0;
    private double area = 0;
    private double circum = 0;
    private double pie = 3.141592653589793238;
    private double distance = 0;

    Circle(double x, double y, double rad){
        this.radius = rad;
    }

    public double area(){
        area = pie * Math.pow(radius, 2);
        System.out.println("Circle Area : " + area);
        return area;
    }

    public double circumference(){
        circum = pie * 2 * radius;
        System.out.println("Circle Circumference : " + circum);
        return circum;
    }

    public double distance(double x2,double x1,double y2,double y1){
        double ansdistance = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        this.distance = ansdistance;
        System.out.println("");
        System.out.println("Distance between the two circle : " + distance);
        return distance;
    }

    public void intersect(double rad1,double rad2){
        double diff = rad1 - rad2;
        double add = rad1 + rad2;
        if (diff < distance && distance < add){
            System.out.println("The two circles do intersect");
        }
        else{
            System.out.println("The two circles don't intersect");
        }
    }
}