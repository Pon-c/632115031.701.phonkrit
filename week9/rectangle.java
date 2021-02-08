package week9;

public class rectangle extends shape {
    int width;
    int height;

    public rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    public String toString(){
        return "This is a rectangle with width as " + width + " and height as " + height;
    }
}
