class student1
{
int rollno;
String name;
static String college="vmu";
student1(int r,String n)
{
rollno=r;
name=n;
}
void display()
{
System.out.println(rollno+" "+name+" "+college);
}
public static void main(String arr[])
{
student1 s1=new student1(10,"mukesh");
student1 s2=new student1(20,"tilak");
s1.display();
s2.display();
}
}
