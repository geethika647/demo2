//FOR EMPLOYEE
class Employe
{
int eid;
String ename;
String dep;
void insertRecord(int r,String n, String d)
{
eid=r;
ename=n;
dep=d;
}
void displayinformation()
{
System.out.println(eid+" "+ename+" "+dep);
}
}
class TestEmploye
{
public static void main(String args[])
{
Employe e1=new Employe();
Employe e2=new Employe();
Employe e3=new Employe();
e1.insertRecord(544,"bobby","infosys");
e2.insertRecord(545,"chintu","TCS");
e3.insertRecord(546,"honey","DELL");
e1.displayinformation();
e2.displayinformation();
e3.displayinformation();
}
}


