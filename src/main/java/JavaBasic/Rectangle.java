package JavaBasic;

public class Rectangle {

    int length;
    int breadth;

    int area;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public static int getArea(int length,int breadth){
        return length*breadth;
    }

    public int perimeter(){

        return 2*(length*breadth);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", breadth=" + breadth +
                ", area=" + getArea(length,breadth) +
                ", perimeter =" + perimeter() +
                '}';
    }

    public static void main(String[] args) {
        Rectangle R= new Rectangle(2,22);
        System.out.println(R);
    }
}
