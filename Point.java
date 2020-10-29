public class Point{
  private double x,y;
  public Point(double X,double Y){
    x=X;
    y=Y;
  }
  public Point(Point p){
    x= p.x;
    y= p.y;
  }
  public double getX(){
    return x;
  }
  public double getY(){
    return y;
  }
  public void changeX(double newx){
    x=newx;
  }
  public void changeY(double newy){
    y=newy;
  }
  public double distanceTo(Point other){
    return (Math.sqrt(((other.x-x)*(other.x-x))+((other.y-y)*(other.y-y))));
  }
  public boolean equals(Point other){
    return ((other.x==x)&&(other.y==y));
  }
}
