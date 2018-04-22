public class triangle implements Measure{
    private double a,b,angle;
    public triangle(){

    }
    public triangle(double a1,double b1,double angle1){
        this();
        setA(a1);
        setB(b1);
        setAngle(angle1);
    }
    public void setA(double a1){
        a=a1;
    }
    public void setB(double b1){
        b=b1;
    }
    public void setAngle(double angle1){
        angle=angle1;
    }
    public void perimeter(){
        System.out.println("perimeter="+((Math.sqrt(a*a+b*b)+a+b)));
    }
    public void area(){
        System.out.println("area="+(a*b)/2);
    }
}
