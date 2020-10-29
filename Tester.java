public class Tester{
  public static void main(String[]args){
    Point a=new Point(2.0, 0.0);
    Point b=new Point(1.0,0.0);
    Point c=new Point(2.0,0.0);
    System.out.println(a.getX());
    System.out.println(a.getY());
    System.out.println(a.distanceTo(b));
    System.out.println(a.equals(c));
  }
}
