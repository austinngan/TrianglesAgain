public class Tester{
  public static void main(String[]args){
    Point a=new Point(0.5248, -0.8002);
    Point b=new Point(-2.437885, 1.94);
    Point c=new Point(0.5248, -0.8002);
    Point d=new Point(0.0,0.0);
    Triangle s1=new Triangle(a,b,d);
    System.out.println(a.getX());
    System.out.println(a.getY());
    System.out.println(a.distanceTo(b));
    System.out.println(a.equals(c));
    System.out.println(s1.getPerimeter());
    System.out.println(s1.classify());
    System.out.println(s1.toString());
    System.out.println(s1.getArea());
    System.out.println(s1.setVertex(1,c));
  }
}
