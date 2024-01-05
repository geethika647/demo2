class Circle
{
int radius;
void insert(int r)
{
radius=r;
}
void calculateArea()
{
System.out.println(radius*radius*3.14);
}
}
class Circle1
{
public static void main(String args[])
{
Circle c=new Circle();
c.insert(7);
c.calculateArea();
}
}