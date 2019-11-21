
class CTriangle extends CShape
{
    protected double a;
    protected double b;
    protected double c;
    public CTriangle (double a,double b,double c)
    {
        a=A;
        b=B;
        c=C;
    }
    public void show()
    {
        System.out.print("color="+red+", ");
        System.out.println("area="+0.5*a*b);
    }
}
