import java.util.Arrays;

public class Point3D extends Point2D{
    float z;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        super.setXY(x,y);
        this.z = z;
    }
    public float [] getXYZ (){
        float [] getXYZ = {x,y,z};
        return getXYZ;
    }
    public String toString (){
        return "Toa do hien tai la: " + Arrays.toString(getXYZ());
    }

}
