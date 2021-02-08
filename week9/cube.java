package week9;

public class cube extends rectangle {
    int length;

    public cube(int width, int height, int length){
        super(width, height);
        this.length = length;
    }

    public String toString(){
        return "This is a cube with the side of " + length;
    }
}
