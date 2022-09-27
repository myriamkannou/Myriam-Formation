

public class Point {
    private float x;
    private float y;
    // getter and setter 
    public void setX(float x){
        this.x=x;
    }
    public float getX(){
        return this.x;
    }
    public void setY(float y){
        this.y=y;
    }
    public float getY(){
        return this.y;
    }
    //constructors
    Point(){
        System.out.println("Constructeur par default");
    }
    Point(float x, float y){
        this.x=x;
        this.y=y;
    }
    //methode deplacer
    public void deplacer(float a, float b){
        this.x=a;
        this.y=b;
    }
    //methode afficher
    public void afficher(){
        System.out.println("x : " + this.x + "\n y : " + this.y);
    }
}

