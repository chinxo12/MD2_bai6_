import java.util.Arrays;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint() {
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float [] getSpeed(){
        float [] getSpeed = {this.xSpeed,this.ySpeed};
        return getSpeed;
    }
    public float[] move(){
        float x = getX();
        float y = getY();
        x += xSpeed;
        y+=ySpeed;
        float[] arr = {x,y};
       return arr;
    }
    public String toString (){
        return "Tọa độ hiện tại là: " + Arrays.toString(super.getXY()) + "Toc do " + Arrays.toString(getSpeed());
    }
}
