
class Complexe {

    private float Re;
    private float Im;

    //getter and setter
    public void setRe(float Re){
        this.Re=Re;
    }
    public float getRe(){
        return this.Re;
    }
    public void setIm(float Im){
        this.Im=Im;
    }
    public float getIm(){
        return this.Im;
    }

    // constructor
    Complexe(){
        System.out.println("Default constructor\n");
    }
    Complexe(float Re, float Im){
        this.Re=Re;
        this.Im=Re;
    }
    // methode affichage
    public void affichage(){
        System.out.println("Z = " + this.getRe()+" + : "+ this.getIm()+ " i ");
    }
    // methode d'ajout
    Complexe add( Complexe z){
        Complexe Res= new Complexe(0,0);
        Res.setRe(z.Re+this.Re);
        Res.setIm(z.Im+this.Im);
        return Res;
    }

    public static void main(String[] args){
        Complexe C1 = new Complexe(1,3);
        C1.affichage();

    }
}