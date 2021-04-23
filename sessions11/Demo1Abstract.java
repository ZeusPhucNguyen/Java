package sessions11;

 abstract public class Demo1Abstract {
    private String color;

    public Demo1Abstract(String color){
        this.color = color;
    }

    @Override
    public String toString(){
        return "Shape[color =" + color + "]";
    }
    abstract public double getArea();
}
