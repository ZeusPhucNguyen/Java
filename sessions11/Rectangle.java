package sessions11;

public class Rectangle  extends Shape{
    private int length,width;

    public Rectangle(String color , int length , int width){
        super(color);
        this.length = length;
        this.width = width;
    }
    public String toString(){
        return "Rectangle[length=" + length + ",width" + width + "," + super.toString();
    }
    @Override
    public double getArea(){
        return length*width;
    }
}
