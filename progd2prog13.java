class Perimeter
{
int radius;
double value;
void insert(int r,double v)
{
radius=r;
value=v;
}
void calculateArea()
{
System.out.println( "perimeter of a circle="+2*value*radius);
}
}
class Perimeter1
{
public static void main(String args[])
{
Perimeter p1=new Perimeter();
p1.insert(1,3.14);
p1.calculateArea();
}
}