public class Main {
    public static void main(String[] args) {
        System.out.println("----------Circle-----------");
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(2.1,"Blue");
        System.out.println(circle);
        System.out.println("-------------Cylinder----------------");
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(3.9,"white",6.5);
        System.out.println(cylinder);
    }
}