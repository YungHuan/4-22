class circle implements Measure {
    private double r;
    public circle(){

    }
    public  circle(double r1){
        this();
        setR(r1);
    }
    public void setR(double r1){
        r=r1;
    }
    public void perimeter(){
        System.out.println("perimeter="+((2*r)*PI));
    }
    public void area(){
        System.out.println("area="+(r*r*PI));
    }
}
