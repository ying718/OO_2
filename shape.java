interface Shape
{
  abstract void getArea()
}

class Rectangle implements Shape
{
  double length;
  double width;
  public Rectangle(double l, double w)
  {
    length = l;
    width = w;
  }

  public void getArea()
  {
    System.out.println("Rectangle ="+length*width);
  }

  public String toString()
  {
  return "Area = ";
  }

}

class Triangle implements Shape
{
  double base;
  double height;
  public Triangle(double b, double h)
  {
    base = b;
    height = h;
  }

  public void getArea()
  {
    System.out.println("Triangle ="+base*height/2);
  }
  public String toString (){
    return "Area = ";
  }
}

public class app11
{
	public static void main (String args[])
	{
		Rectangle rec = new Rectangle(10,20);
		System.out.println(rec);
		Triangle tri = new Triangle(10,20):
		System.out.println(tri);
	}
}
