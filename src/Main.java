public class Main {

    public static void main(String[] args) {
        circle cir =new circle(2);
        System.out.println("圓形");
        cir.area();
        cir.perimeter();
        triangle tri=new triangle(3,4,90);
        System.out.println("三角形");
        tri.area();
        tri.perimeter();
        rectangle rect=new rectangle(4,5);
        System.out.println("矩形");
        rect.area();
        rect.perimeter();
    }
}
