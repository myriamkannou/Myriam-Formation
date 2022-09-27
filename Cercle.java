
import java.lang.Math;
public class Cercle {
    public Cercle() {
    }
    Point center;
    double r;
    public Cercle(Point center, double r) {
        // public Cercle(float x, float y, double r )??
        this.center = center;
        //this.center= new center(x,y)??
        this.r = r;
    }
    public Point getCenter() {
        return center;
        // return getX() et return getY()??
    }
    public void setCenter(Point center) {
        this.center = center;
    }
    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }
    // methode surface 
    public double surface(){
        double surface=0;
        surface=Math.pow(this.r,2)*3.14;
        return surface;
    }
    public double perimetre(){
        double peri=0;
        peri= 2 * 3.14 * (this.r);
        return peri;
    }
}
