class student{
int id;
String name;

student(int i,String n)
{
id=i;
name=n;
}
student(student e)
{
id=e.id;
name=e.name; 
}
void display()
{
System.out.println(id+" "+name);
}
public static void main(String arr[])
{
student s1=new student(10,"ram");
student s2=new student(s1);
s1.display();
s2.display();
}
}