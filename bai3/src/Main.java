import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);
        point = new Point(3,2);
        System.out.println(point);
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);
        movablePoint = new MovablePoint(2.3f,2.1f,3,2);
        System.out.println(movablePoint);
        System.out.println(Arrays.toString(movablePoint.getSpeed()));
    }
}