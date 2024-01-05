//INTILIZATION THROUGH METHOD
class Student
{
int rollno;
String name;
void insertRecord(int r,String n)
{
rollno=r;
name=n;
}
void displayinformation()
{
System.out.println(rollno+" "+name);
}
}
class TestStudent1
{
public static void main(String args[])
{
Student s1=new Student();
Student s2=new Student();
s1.insertRecord(544,"geethika");
s2.insertRecord(545,"chintu");
s1.displayinformation();
s2.displayinformation();
}
}

