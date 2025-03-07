import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Triangle tri=new Triangle("red",1.1f,2.0f);
        Circle c=new Circle("yellow",1.5f);
        Square sq=new Square("blue",1.2f);
        System.out.println("Area :" +tri.getArea()+" details : "+tri);
        System.out.println("Area :" +c.getArea()+" details : "+c);
        System.out.println("Area :" +sq.getArea()+" details : "+sq);
        Triangle tri2=new Triangle("red",1.1f,2.0f);
        System.out.println("Triangle2 equals Triangle1:"+tri.equals(tri2));
        Triangle tri3=new Triangle("brown",1.1f,2.0f);
        System.out.println("Triangle3 equals Triangle1:"+tri.equals(tri3));

    }
}