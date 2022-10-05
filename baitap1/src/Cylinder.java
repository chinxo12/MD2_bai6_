public class Cylinder extends Circle{
    double height;

    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double volume (){
        double volume = area()*this.height;
        return volume;
    }
    public String toString (){
        return "The Cylinder With radius = " + super.radius + " height = " +this.height + " Volume is: " + volume();
    }
}
